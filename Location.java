package com.LabProject;

public class Location {
    public final String EAST = "East";

    public final String WEST = "West";
    public final String SOUTH = "South";
    public final String NORTH = "North";
    private String currentLocation = "Foyer";




    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }



    public void move(String direction) {
        System.out.println("You're moving from the [" + currentLocation + "] in the following direction: [" + direction + "]");

        switch (currentLocation) {
            case "Foyer" -> handleFoyerMove(direction);
            case "Kitchen" -> handleKitchenMove(direction);
            case "Attic" -> handleAtticMove(direction);
            case "Basement" -> handleBasementMove(direction);
        }

    }



    //state ( location ) has been updated
    public void handleFoyerMove(String direction) {

        if(direction.equals(EAST))
            currentLocation = "Kitchen";
        else
            System.out.println(" cant get there from here...  ");




    }

    public void handleKitchenMove(String direction) {

        switch (direction) {
            case SOUTH -> currentLocation = "Basement";
            case WEST -> currentLocation = "Foyer";
            case NORTH -> currentLocation = "Attic";
            default -> System.out.println("Cant get there from here");
        }


    }


    public void handleBasementMove(String direction){
        if(direction.equals(NORTH))
            currentLocation = "Kitchen";
        else
            System.out.println("Cant get there from here");
    }

    public void handleAtticMove(String direction){
        if(direction.equals(SOUTH))
            currentLocation = "Kitchen";
        else
            System.out.println("Cant get there from here");
    }

}

