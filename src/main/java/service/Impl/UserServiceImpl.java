package service.Impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import pojo.User;
import service.UserService;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findall() {
        System.out.println("查询用户userservice");
        return userDao.findall();
    }

    @Override
    public void save(User user) {
        System.out.println("增加用户");
        userDao.save(user);
    }
}
