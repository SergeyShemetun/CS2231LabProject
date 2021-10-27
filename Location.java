package com.LabProject;

import java.util.Scanner;

public class Location {

    private String currentPosition;
    private String userLocation;
    private String optionNorth;
    private String optionEast;
    private String optionSouth;
    private String optionWest;

    public Location(String location) {
        this.currentPosition = location;
        userLocation = "Center";
        optionNorth = "north";
        optionSouth = "south";
        optionEast = "east";
        optionWest = "west";
    }

    public void move(){
        System.out.println("What direction would you like to go?");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
    }





    public void move(String direction) {
        System.out.println("You are moving " + direction + " from " + currentPosition + ". ");
        if (currentPosition.equalsIgnoreCase("Foyer"))
            handleFoyerMove(direction);
        else if (currentPosition.equalsIgnoreCase("Kitchen"))
            handleKitchenMove(direction);
        else if (currentPosition.equalsIgnoreCase("Attic"))
            handleAtticMove(direction);
        else if (currentPosition.equalsIgnoreCase("Basement"))
            handleBasementMove(direction);
        else
            System.out.println("You cannot move in that direction.");
    }

    public String printCurrentOptions() {
        return("Your current position is: " + currentPosition);
    }

    public void handleFoyerMove(String direction) {
        if (direction.equalsIgnoreCase(optionNorth))
            currentPosition = "Foyer";
        else if (direction.equalsIgnoreCase(optionSouth))
            currentPosition = "Foyer";
        else if (direction.equalsIgnoreCase(optionEast))
            currentPosition = "Kitchen";
        else if (direction.equalsIgnoreCase(optionWest))
            currentPosition = "Foyer";
        else
            System.out.println("You cannot move there right now.");
    }

    public void handleKitchenMove(String direction) {
        if (direction.equalsIgnoreCase(optionNorth))
            currentPosition = "Attic";
        else if (direction.equalsIgnoreCase(optionSouth))
            currentPosition = "Basement";
        else if (direction.equalsIgnoreCase(optionEast))
            currentPosition = "Kitchen";
        else if (direction.equalsIgnoreCase(optionWest))
            currentPosition = "Foyer";
        else
            System.out.println("You cannot move there right now.");
    }

    public void handleAtticMove(String direction) {
        if (direction.equalsIgnoreCase(optionNorth))
            currentPosition = "Attic";
        else if (direction.equalsIgnoreCase(optionSouth))
            currentPosition = "Kitchen";
        else if (direction.equalsIgnoreCase(optionEast))
            currentPosition = "Attic";
        else if (direction.equalsIgnoreCase(optionWest))
            currentPosition = "Attic";
        else
            System.out.println("You cannot move there right now.");
    }

    public void handleBasementMove(String direction) {
        if (direction.equalsIgnoreCase(optionNorth))
            currentPosition = "Kitchen";
        else if (direction.equalsIgnoreCase(optionSouth))
            currentPosition = "Basement";
        else if (direction.equalsIgnoreCase(optionEast))
            currentPosition = "Basement";
        else if (direction.equalsIgnoreCase(optionWest))
            currentPosition = "Basement";
        else
            System.out.println("You cannot move there right now.");
    }

    public String CurrentPosition() {
        return currentPosition;
    }

}


