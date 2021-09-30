package com.cs2231L.Milestone1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Help {
    public final String[] Commands;

    Help(){
        this.Commands = new String[]{"East", "West", "South", "North","End"};
    }

    public void printCommands(){
        System.out.println("Here are all available commands for you to type:");
        for (String command: Commands ){
            System.out.println(command);
        }
    }

    //Method that checks if the command is in the command list
    public boolean checkCommands(String command){
        List<String> directionList = new ArrayList<>(Arrays.asList(Commands));
        return directionList.contains(command);
    }
}
