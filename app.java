package com.LabProject;

import java.util.Scanner;


public class app {


    public static void main(String[] args) {

        mainOne();

    }

        public static void mainOne() {
            user main = new user();
            main.getPosition();
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            main.move(userInput);
            main.showOptions();
        }
            
        /*
        System.out.println("Welcome to the Cave");
        System.out.println();

        System.out.println("Your current location is: " + Location);

        Scanner input = new Scanner(System.in);
        System.out.print("What direction would you like to go? North, South, East or West?");
        String direction = input.nextLine();

         */


        }






