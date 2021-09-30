package com.cs2231L.Milestone1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String direction;
        String user1_name;

        // Setting up user info
        User user1 = new User();
        System.out.println("Set your user name: ");
        user1_name = input.nextLine();
        user1.setName(user1_name);

        System.out.println();
        System.out.println("Hello " + user1.getName());
        System.out.println("Welcome to the game!");

        // print list of commands
        System.out.println();
        Help Commands = new Help();
        Commands.printCommands();

        while (true){
            System.out.println();
            System.out.println("Which way do you want to go?");
            direction=input.nextLine();
            List<String> directionList = new ArrayList<>(Arrays.asList(Commands.Commands));
            if (directionList.contains(direction)){
                if (direction.equals("End")){
                    System.out.println("Good bye!");
                    break;
                }
                else{
                    user1.move(direction);
                    System.out.println("You are now in "+user1.whereAmI());
                }
            }
            else{
                System.out.println("Invalid Command. Please try again!");
            }
        }
    }
}
