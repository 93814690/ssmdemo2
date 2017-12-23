package top.liyf.mapper;

import top.liyf.bean.User;

import java.util.List;

public interface UserMapper {

    public List<User> getAllUser();

    public User getUserByUid(int uid);

    int addUser(User user);

    User login(User user);
}
