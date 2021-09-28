package com.LabProject;

public class User {
    private String name;
    private Location location;

    public void Toad()
    {
        name = "hoppy";
        location = new Location();
    }

    public void Toad (String name)
    {

        this.name = name;
        location = new Location();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String whatDoIDo() {

        return "I am a user, my name is " + this.name ;

    }

    public void move(String direction) {

        location.move(direction);

    }

    public String whereAmI() {
        return location.getCurrentLocation();
    }





}



