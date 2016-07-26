package com.blankjnlp.application.manager;

import java.util.List;

import com.blankjnlp.application.domain.User;

public interface IUserManager {

    List<User> findAll();

    void save(User user);

}
