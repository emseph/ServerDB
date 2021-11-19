package com.ejo;

import javax.swing.*;

public class formLogin {
    String username;
    String password;
    private JFrame loginFrame;
    public formLogin (){

        loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(500,500);
        loginFrame.setLayout(null);
        loginFrame.setResizable(false);
        loginFrame.setVisible(true);
        loginFrame.setLayout(null);
        loginFrame.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new formLogin();
    }

    public static void loginAction() {

    }
}
