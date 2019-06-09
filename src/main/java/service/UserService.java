package service;

import org.springframework.stereotype.Service;
import pojo.User;

import java.util.List;

public interface UserService {

    public List<User> findall();
    public void save(User user);
}
