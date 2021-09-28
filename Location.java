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

        if(currentLocation.equals("Foyer"))
            handleFoyerMove(direction);

        else if (currentLocation.equals("Kitchen"))
            handleKitchenMove(direction);
        else if (currentLocation.equals("Attic"))
            handleAtticMove(direction);
        else if (currentLocation.equals("Basement"))
            handleBasementMove(direction);

        System.out.println("Your new location is "+ currentLocation);
    }



    //state ( location ) has been updated
    public void handleFoyerMove(String direction) {

        if(direction.equals(EAST))
            currentLocation = "Kitchen";
        else
            System.out.println(" cant get there from here...  ");




    }

    public void handleKitchenMove(String direction) {

        if(direction.equals(SOUTH))
            currentLocation = "Basement";

        else if (direction.equals(WEST))
            currentLocation="Foyer";
        else if (direction.equals(NORTH))
            currentLocation="Attic";
        else
            System.out.println("Cant get there from here");


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

