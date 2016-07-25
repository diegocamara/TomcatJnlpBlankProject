package com.blankjnlp.application.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blankjnlp.application.dto.ReportTestDTO;
import com.blankjnlp.application.manager.IUserManager;
import com.blankjnlp.application.reports.ReportsUtil;

@Component
public class UserView extends AbstractView {

    private static final long serialVersionUID = 1L;

    @Autowired
    public IUserManager userManager;

    @Override
    public void init() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container content = this.getContentPane();

        content.add(new JLabel("JLabel"), BorderLayout.CENTER);

        JButton jButton = new JButton("JButton");

        jButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                ReportTestDTO report = new ReportTestDTO();
                report.setFileName("reportTest.jrxml");

                ReportsUtil.generateReport(report);

            }
        });

        content.add(jButton, BorderLayout.SOUTH);

        this.pack();

    }

    public IUserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(IUserManager userManager) {
        this.userManager = userManager;
    }

}
