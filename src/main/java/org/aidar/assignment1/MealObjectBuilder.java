package org.aidar.assignment1;

public class MealObjectBuilder implements MealBuilder{
    private String main, side, drink;
    public MealObjectBuilder setMainDish(String main){
        this.main = main;
        return this;
    }

    public MealObjectBuilder setSideDish(String side){
        this.side = side;
        return this;
    }

    public MealObjectBuilder setDrink(String drink){
        this.drink = drink;
        return this;
    }
    
    public Meal getResult(){
        if(main == null && side == null && drink == null){
            throw new IllegalArgumentException("At least 1 order is required");
        }
        return new Meal(main, side, drink);
    }
}
