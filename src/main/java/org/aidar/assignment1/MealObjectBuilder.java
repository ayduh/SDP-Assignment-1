package org.aidar.assignment1;

public class MealObjectBuilder implements MealBuilder{
    private String main, side, drink;
    @Override
    public MealObjectBuilder setMainDish(String main){
        this.main = main;
        return this;
    }

    @Override
    public MealObjectBuilder setSideDish(String side){
        this.side = side;
        return this;
    }

    @Override
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
