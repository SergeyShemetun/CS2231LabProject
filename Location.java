package com.cs2231L.Milestone1;

public class Location {
    public final String EAST = "East";
    public final String NORTH = "North";
    public final String SOUTH = "South";
    public final String WEST = "West";
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
        if(currentLocation.equals("Kitchen"))
            handleKitchenMove(direction);
        if(currentLocation.equals("Attic"))
            handleAtticMove(direction);
        if(currentLocation.equals("Basement"))
            handleBasementMove(direction);
        System.out.println(" You're updated location is " + currentLocation);
    }

    public void handleFoyerMove(String direction) {
        if(direction.equals(EAST))
            currentLocation = "Kitchen";
        else
            System.out.println(" cant get there from here...  ");
    }

    public void handleKitchenMove(String direction) {
        if(direction.equals(NORTH))
            currentLocation = "Attic";
        if(direction.equals(SOUTH))
            currentLocation = "Basement";
        if(direction.equals(WEST))
            currentLocation = "Foyer";
        else
            System.out.println(" cant get there from here...  ");
    }

    public void handleAtticMove(String direction) {
        if(direction.equals(SOUTH))
            currentLocation = "Kitchen";
        else
            System.out.println(" cant get there from here...  ");
    }

    public void handleBasementMove(String direction) {
        if(direction.equals(NORTH))
            currentLocation = "Kitchen";
        else
            System.out.println(" cant get there from here...  ");
    }

}
