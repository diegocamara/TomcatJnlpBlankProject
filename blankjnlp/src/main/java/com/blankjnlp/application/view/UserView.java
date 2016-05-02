package com.blankjnlp.application.view;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blankjnlp.application.manager.IUserManager;

@Component
public class UserView extends JFrame {

	private static final long serialVersionUID = 1L;

	@Autowired
	public IUserManager userManager;

	public IUserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(IUserManager userManager) {
		this.userManager = userManager;
	}

}
