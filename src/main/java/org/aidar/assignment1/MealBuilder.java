package org.aidar.assignment1;

public interface MealBuilder {
    MealBuilder setMainDish(String main);
    MealBuilder setSideDish(String side);
    MealBuilder setDrink(String drink);
}