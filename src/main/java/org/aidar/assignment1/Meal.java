package org.aidar.assignment1;

public class Meal {
    private final String main, side, drink;
    Meal(String main, String side, String drink){
        this.main = main;
        this.side = side;
        this.drink = drink;
    }

    @Override public String toString(){
        return "Computer[" + main + ", " + side + ", " + drink +"]";
    }
}
