package com.LabProject;

import java.util.Scanner;

//Not being able to end the game is a marketing move casue the longer the user spends in a game the more add revenue we get
public class app {


    public static void main(String[] args) {

        System.out.print("Welcome to the Cave");
        mainOne();

    }

        public static void mainOne() {
            user player = new user();
            Help Help=new Help();
            //Location Location=new Location("center");
            while(true) {
                player.getPosition();
                Scanner input = new Scanner(System.in);

                System.out.println();

                System.out.println("Your current location is: " + player.getPosition());
                System.out.println("What direction would you like to go? North, South, East or West?");
                String userInput = input.nextLine();
                if(userInput.equals("End")){
                    System.out.println("Goodbye!");
                    break;
                }
                else{
                if(userInput.equals("Help")){
                    Help.printCommands();
                }
                else{
                player.move(userInput);}
                player.showOptions();
                }
            }
        }
            






        }






