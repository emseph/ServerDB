package com.ejo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class formLogin {
    String username;
    String password;
    String masterUser = "master";
    String masterPw = "master";
    int loginCount = 0;
    private JFrame loginFrame;
    public JButton loginButton = new JButton(new AbstractAction("Login") {
        @Override
        public void actionPerformed(ActionEvent e) {
            String userCheck = userField.getText();
            String pwCheck = pwField.getText();
            System.out.println("Login Action Attempted!");
            if (userCheck.equals(masterUser) && pwCheck.equals(masterPw)){
                System.out.println("user: " + userCheck);
                System.out.println("pw: " + pwCheck);
                System.out.println("Login Successful");
                userField.setText("");
                pwField.setText("");
                loginCount++;
                System.out.println(loginCount);
            }
            else if (userCheck.equals("") || pwCheck.equals("")){
                System.out.println("Field/s cannot be empty");
            }
            else {
                System.out.println("Wrong credentials");
                userField.setText("");
                pwField.setText("");
            }
        }
    });

    private JTextField userField = new JTextField("",5);
    private JTextField pwField = new JTextField("",5);

    private JLabel userLbl = new JLabel("Username:");
    private JLabel pwLbl = new JLabel("Password:");
    public formLogin (){
        loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(500,500);
        loginFrame.setLayout(null);
        loginFrame.setResizable(false);
        loginFrame.setVisible(true);
        loginFrame.setLayout(null);
        loginFrame.setLocationRelativeTo(null);

        //Add components to frame
        loginFrame.add(loginButton);
        loginFrame.add(userField);
        loginFrame.add(pwField);
        loginFrame.add(userLbl);
        loginFrame.add(pwLbl);

        userLbl.setBounds(115,155,100,35);
        userLbl.setFont(new Font("Verdana", Font.PLAIN, 15));
        pwLbl.setBounds(120,200,100,35);
        pwLbl.setFont(new Font("Verdana", Font.PLAIN, 15));

        userField.setBounds(200,155,200,35);

        pwField.setBounds(200,200,200,35);

        loginButton.setBounds(200,250,100,35);
        loginButton.setFocusable(false);
        loginButton.setFont(new Font("Verdana", Font.PLAIN, 15));


    }
    public static void main(String[] args) {
        new formLogin();
    }

    public void loginAction() {
        formLogin fL = new formLogin();

    }
}
