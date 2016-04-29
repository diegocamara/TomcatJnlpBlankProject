package com.blankjnlp.application;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {

	static BasicService basicService;

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).web(false)
				.run(args);

		JFrame jFrame = new JFrame("JNLP");

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container content = jFrame.getContentPane();

		content.add(new JLabel("JLabel"), BorderLayout.CENTER);

		JButton jButton = new JButton("JButton");

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					URL url = new URL(e.getActionCommand());
				} catch (MalformedURLException ex) {

				}
			}
		});

		content.add(jButton, BorderLayout.SOUTH);

		try {
			basicService = (BasicService) ServiceManager.lookup("javax.jnlp.BasicService");
		} catch (UnavailableServiceException e) {
			System.err.println("Lookup failed: " + e);
		}

		jFrame.pack();
		jFrame.setVisible(true);

	}

}
