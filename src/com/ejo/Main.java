package com.ejo;

import javax.security.auth.login.LoginContext;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    formLogin Login = new formLogin();
    JButton loginButton = Login.loginButton;
    private void GUI(){

    }

    public static void main(String[] args) {
        int count = 1;
        if ( count ==1 ){
            formLogin Login = new formLogin();
        }
        else{
            System.out.println("No forms loaded");
        }



//        Scanner scUser = new Scanner(System.in);
//        Scanner scPw = new Scanner(System.in);
//        System.out.println("Enter your username:");
//        Login.username = scUser.nextLine();
//        System.out.println("Enter your password:");
//        Login.password = scPw.nextLine();
//        System.out.println("");
//        System.out.println("Username is: " + Login.username);
//        System.out.println("Password is: " + Login.password);


//        if (Login.loginCount == 1) {
//            System.out.println(Login.loginCount);
//            formMainMenu MainMenu = new formMainMenu();
//        }

    }

}
