package org.aidar.assignment1;

public class MealReceiptBuilder implements MealBuilder{
    private final StringBuilder sb = new StringBuilder("- Order Receipt -\n");

    public MealReceiptBuilder setMainDish(String main){
        sb.append("Main Dish: ").append(main).append("\n");
        return this;
    }

    public MealReceiptBuilder setSideDish(String side){
        sb.append("Side Dish: ").append(side).append("\n");
        return this;
    }

    public MealReceiptBuilder setDrink(String drink){
        sb.append("Drink Dish: ").append(drink).append("\n");
        return this;
    }

    public String getResult(){return sb.toString();}
}