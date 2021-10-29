package com.LabProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class user {

    private String starting_position;
    private Location location;
    private ScoreableItems scoreableItems = new ScoreableItems();
    private List<String> currentItems = new ArrayList<>();
    private int points = 0;


    public user() {
        starting_position = "Foyer";
        location = new Location(starting_position);
    }
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void move(String direction){
        location.move(direction);
        checkForScoreableItemsOpp(direction);
    }

    public void showOptions(){
        location.printCurrentOptions();
    }

    public String getPosition(){
        return location.CurrentPosition();
    }
    private void checkForScoreableItemsOpp(String direction) {

        //check for scoreable items based on the direction & position
        checkPointsOppAttic(direction);
        checkPointsOppKitchen(direction);
        checkPointsOppBasement(direction);
        checkPointsOppBedroom(direction);
    }

    private void checkPointsOppAttic(String direction) {
        if(location.CurrentPosition().equals("Attic") && direction.equalsIgnoreCase("North") ) {
            System.out.println("Score...  maybe!  there is a secret panel, would you like to reach inside?  Y/N ");
            System.out.println("The possibilities are: " );
            scoreableItems.displayCurrentItems();

            Scanner s = new Scanner(System.in);
            String response = s.nextLine();
            if(response.equalsIgnoreCase("Y")) {
                System.out.println("Well done, you found a fortune cookie - worth 10 points! " );
                currentItems.add("Fortune Cookie");
                points += scoreableItems.getItem("Fortune Cookie");
            }
            else {
                System.out.println("OK, better luck next time.." );
            }
        }
    }

    private void checkPointsOppKitchen(String direction) {
        if(location.CurrentPosition().equals("Kitchen") && direction.equalsIgnoreCase("East") ) {
            System.out.println("Score...  maybe!  there is a secret panel, would you like to reach inside?  Y/N ");
            System.out.println("The possibilities are: " );
            scoreableItems.displayCurrentItems();

            Scanner s = new Scanner(System.in);
            String response = s.nextLine();
            if(response.equalsIgnoreCase("Y")) {
                System.out.println("You just made a bomb explode - minus 15 points! (Sorry!)" );
                currentItems.add("Bomb Shards");
                points += scoreableItems.getItem("Bomb");
            }
            else {
                System.out.println("OK, better luck next time.." );
            }
        }
    }

    private void checkPointsOppBasement(String direction) {
        if(location.CurrentPosition().equals("Basement") && direction.equalsIgnoreCase("West") ) {
            System.out.println("Score...  maybe!  there is a secret panel, would you like to reach inside?  Y/N ");
            System.out.println("The possibilities are: " );
            scoreableItems.displayCurrentItems();

            Scanner s = new Scanner(System.in);
            String response = s.nextLine();
            if(response.equalsIgnoreCase("Y")) {
                System.out.println("You have been poisoned - minus 15 points! (Sorry!)" );
                currentItems.add("Empty Poison Bottle");
                points += scoreableItems.getItem("Poison");
            }
            else {
                System.out.println("OK, better luck next time.." );
            }
        }
    }

    private void checkPointsOppBedroom(String direction) {
        if(location.CurrentPosition().equals("Bedroom") && direction.equalsIgnoreCase("East") ) {
            System.out.println("Score...  maybe!  there is a secret panel, would you like to reach inside?  Y/N ");
            System.out.println("The possibilities are: " );
            scoreableItems.displayCurrentItems();

            Scanner s = new Scanner(System.in);
            String response = s.nextLine();
            if(response.equalsIgnoreCase("Y")) {
                System.out.println("You have been awarded with Fried Chicken - worth 25 points!" );
                currentItems.add("Fried Chicken");
                points += scoreableItems.getItem("Fried Chicken");
            }
            else {
                System.out.println("OK, better luck next time.." );
            }
        }
    }
}
