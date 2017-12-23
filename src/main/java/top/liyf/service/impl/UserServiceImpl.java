package top.liyf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.liyf.bean.User;
import top.liyf.mapper.UserMapper;
import top.liyf.service.UserService;

import java.util.List;

/**
 * @author 123
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByUid(int uid) {
        return userMapper.getUserByUid(uid);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.getAllUser();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addUser(User user) throws Exception {
        int addUser = userMapper.addUser(user);
//        int i = 1/0;
        return addUser == 1;
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
