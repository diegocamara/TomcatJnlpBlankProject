package com.blankjnlp.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blankjnlp.application.configconstants.ConstantsConfigurations;
import com.blankjnlp.application.utils.SpringUtils;
import com.blankjnlp.application.view.MainView;

public class Application {

    public static void main(String[] args) {

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
		ConstantsConfigurations.APPLICATION_CONTEXT_FILE);

	MainView mainView = SpringUtils.getBean("mainView", applicationContext);
	mainView.setApplicationContext(applicationContext);
	mainView.setSize(800, 600);
	mainView.setLocationRelativeTo(null);
	mainView.setVisible(true);

    }

}
