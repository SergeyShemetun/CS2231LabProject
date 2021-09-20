package com.LabProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello "+ "user.name");
        System.out.println("Welcome to the game");
       
        Help Commands = new Help();
        Commands.printCommands();
        
        System.out.println("Please tell me what to do");
        Scanner input= new Scanner(System.in);

        while (true) {
            String Command = input.nextLine();
            if (Command.equals(Commands[0]))
            {
                System.out.println("You went forward");
            }
            else if (Command.equals(Commands[1]))
            {
                System.out.println("You went back");
            }
            else if (Command.equals(Commands[2]))
            {
                System.out.println("You went left");
            }

            else if (Command.equals(Commands[3]))
            {
                System.out.println("You went right");
            }
            else if (Command.equals(Commands[4]))
            {
                System.out.println("Bye!");
                break;

            }
            else
                {
                    System.out.println("I don't know this command");
                }

        }

    }
}
