package top.liyf.service;

import top.liyf.bean.User;

import java.util.List;

public interface UserService {

    public User getUserByUid(int uid);

    List<User> findAllUser();

    boolean addUser(User user) throws Exception;

    User login(User user);
}
