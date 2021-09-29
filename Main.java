package com.LabProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Setting up user info
        User user1 = new User();
        System.out.println("Set your user name: ");
        user1_name = input.nextLine();
        user1.setName(input_username);

        String direction;
        System.out.println("Hello " + user1.getName());
        System.out.println("Welcome to the game");

        Help Commands = new Help();
        Commands.printCommands();

        // Figuring out wtf is  going on
        while (true) {
            //supposed to start interacting here
            System.out.println("Which way do you want to go?");
            direction=input.nextLine();
            if (directtion = "End"){
                break;
            }
            else{
                user1.move(direction);
                System.out.println("You are now in "+user1.whereAmI());
            }
        }
    }
}
