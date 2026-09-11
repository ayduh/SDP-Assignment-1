package org.aidar.assignment1;

public class MealReceiptBuilder implements MealBuilder{
    private final StringBuilder sb = new StringBuilder("- Order Receipt -\n");

    @Override
    public MealReceiptBuilder setMainDish(String main){
        sb.append("Main Dish: ").append(main).append("\n");
        return this;
    }

    @Override
    public MealReceiptBuilder setSideDish(String side){
        sb.append("Side Dish: ").append(side).append("\n");
        return this;
    }

    @Override
    public MealReceiptBuilder setDrink(String drink){
        sb.append("Drink: ").append(drink).append("\n");
        return this;
    }

    public String getResult(){return sb.toString();}
}