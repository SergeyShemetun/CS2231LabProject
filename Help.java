package com.cs2231L.Milestone1;

public class Help {
    private final String[] Commands;

    Help(){
        this.Commands = new String[]{"East", "West", "South", "North","End"};
    }

    public void printCommands(){
        System.out.println("Here are all available commands for you to type:");
        for (String command: Commands ){
            System.out.println(command);
        }
    }
}
