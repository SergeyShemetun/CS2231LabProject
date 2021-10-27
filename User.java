package com.ff;

public class User {
    private String name;
    Location location = new Location();

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
