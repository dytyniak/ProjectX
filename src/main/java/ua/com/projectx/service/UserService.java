package ua.com.projectx.service;


import ua.com.projectx.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findByLogin(String login);
}
