package com.blankjnlp.application.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blankjnlp.application.dao.UserDAO;
import com.blankjnlp.application.domain.User;

@Service
public class UserManager extends AbstractManager<UserDAO> implements IUserManager {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> findAll() {
        return this.userDAO.findAll();
    }

    @Override
    @Transactional(noRollbackFor = Exception.class)
    public void save(User user) {
        this.userDAO.save(user);
    }

    @Override
    public UserDAO getDao() {
        return this.userDAO;
    }

}
