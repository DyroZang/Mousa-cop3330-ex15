/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a username: ");
        String user = input.nextLine();

        System.out.println("Please enter a password: ");
        String pass = input.nextLine();

        System.out.println("What is the password?");
        String test = input.nextLine();

        if(pass.equals(test)){
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you.");
        }
    }
}