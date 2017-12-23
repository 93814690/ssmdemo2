package top.liyf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.liyf.bean.User;
import top.liyf.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService service;


    @RequestMapping("/login")
    public String login(User user, HttpSession session) {

        User userByUid = service.login(user);
        session.setAttribute("user", user);

        return "/info.jsp";
    }

    @RequestMapping("/showInfo")
    public String showInfo(int uid, Model model) {

        User userByUid = service.getUserByUid(uid);
        model.addAttribute("user", userByUid);

        return "/info.jsp";
    }

    @RequestMapping("/showAll")
    public String showAll(Model model) {

        List<User> users = service.findAllUser();
        model.addAttribute("users", users);

        return "/showall.jsp";
    }

    @RequestMapping("/adduser")
    public String showAll(User user, Model model) {

        try {
            service.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "/error.jsp";
        }
        return "forward:/showAll.do";
    }
}
