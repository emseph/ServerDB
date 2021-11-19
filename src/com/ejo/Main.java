package com.ejo;

import javax.security.auth.login.LoginContext;
import java.util.Scanner;

public class Main {
    private void GUI(){

    }


    public static void main(String[] args) {
        formLogin Login = new formLogin();
        Scanner scUser = new Scanner(System.in);
        Scanner scPw = new Scanner(System.in);
        System.out.println("Enter your username:");
        Login.username = scUser.nextLine();
        System.out.println("Enter your password:");
        Login.password = scPw.nextLine();
        System.out.println("");
        System.out.println("Username is: " + Login.username);
        System.out.println("Password is: " + Login.password);
    }

}
