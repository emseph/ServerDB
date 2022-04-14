package com.ejo;

import javax.swing.*;

public class formMainMenu {
    private JFrame mainmenuFrame;
    private JLabel placeholder = new JLabel("Placeholder text for Main Menu Class");
    public formMainMenu (){

        mainmenuFrame = new JFrame("Main Menu");
        mainmenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainmenuFrame.setSize(500,500);
        mainmenuFrame.setLayout(null);
        mainmenuFrame.setResizable(false);
        mainmenuFrame.setVisible(true);
        mainmenuFrame.setLayout(null);
        mainmenuFrame.setLocationRelativeTo(null);

        mainmenuFrame.add(placeholder);
        placeholder.setBounds(115,155,100,35);
    }

    public static void main(String[] args) {
        new formMainMenu();
    }
}
