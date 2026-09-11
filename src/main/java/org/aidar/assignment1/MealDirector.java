package org.aidar.assignment1;

public class MealDirector{
    public void makeMeatMeal(MealBuilder b){
        b.setMainDish("Fried Chicken").setSideDish("Cooked Rice").setDrink("Lemonade");
    }

    public void makeVeganMeal(MealBuilder b){
        b.setMainDish("Fried Vegetable Mix").setSideDish("Boiled Potato").setDrink("Mojito");
    }
}