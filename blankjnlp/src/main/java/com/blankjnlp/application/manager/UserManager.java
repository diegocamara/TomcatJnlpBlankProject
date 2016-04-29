package com.blankjnlp.application.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blankjnlp.application.dao.UserDAO;
import com.blankjnlp.application.domain.User;

@Service
public class UserManager implements IUserManager {

	@Autowired
	private UserDAO userDAO;

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

}
