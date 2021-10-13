package com.LabProject;

public class user {

    private String starting_position;
    private Location location;

    public user() {
        starting_position = "Foyer";
        location = new Location(starting_position);
    }

    public void move(String direction){
        location.move(direction);
    }

    public void showOptions(){
        location.printCurrentOptions();
    }

    public String getPosition(){
        return location.CurrentPosition();
    }
}
