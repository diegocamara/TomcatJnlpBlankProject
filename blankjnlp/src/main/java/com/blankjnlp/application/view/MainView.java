package com.blankjnlp.application.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.jnlp.BasicService;
import javax.jnlp.ServiceManager;
import javax.jnlp.UnavailableServiceException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.blankjnlp.application.domain.User;
import com.blankjnlp.application.manager.IUserManager;
import com.blankjnlp.application.utils.SpringUtils;

@Component
public class MainView extends JFrame {

    private static final long serialVersionUID = 1L;

    private static BasicService basicService;
    private ApplicationContext applicationContext;

    private AbstractView activeView;

    public MainView() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container content = this.getContentPane();

        content.add(new JLabel("JLabel"), BorderLayout.CENTER);

        JButton jButton = new JButton("JButton");

        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                UserView userView = SpringUtils.getBean("userView", getApplicationContext());

                setActiveView(userView);
                getActiveView().setVisible(true);
                getActiveView().setLocationRelativeTo(null);

                IUserManager userManager =
                        SpringUtils.getBean("userManager", getApplicationContext());

                User user = new User();
                //                user.setCode(1L);
                user.setName("Testing");

                userManager.save(user);

            }
        });

        content.add(jButton, BorderLayout.SOUTH);

        try {
            basicService = (BasicService) ServiceManager.lookup("javax.jnlp.BasicService");
        } catch (UnavailableServiceException e) {
            System.err.println("Lookup failed: " + e);
        }

        this.pack();

    }

    public AbstractView getActiveView() {
        return activeView;
    }

    public void setActiveView(AbstractView activeView) {
        this.activeView = activeView;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

}
