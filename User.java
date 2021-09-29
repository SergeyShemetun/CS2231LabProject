package com.cs2231L.Milestone1;

public class User {
    private String name;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(String direction) {
        location.move(direction);
    }

    public String whereAmI() {
        return location.getCurrentLocation();
    }
}

