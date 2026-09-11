package org.aidar.assignment1;

public class Client{
    public static void main(String[] args) {
        MealDirector dr = new MealDirector();

        // Meat Meal
        MealObjectBuilder meatOB = new MealObjectBuilder();
        dr.makeMeatMeal(meatOB);
        Meal meatMeal = meatOB.getResult();
        System.out.println("= Meat Meal Object =:\n" + meatMeal + "\n");

        MealReceiptBuilder meatRB = new MealReceiptBuilder();
        dr.makeMeatMeal(meatRB);
        String meatReceipt = meatRB.getResult();
        System.out.println(meatReceipt + "\n");

        // Vegan Meal
        MealObjectBuilder veganOB = new MealObjectBuilder();
        dr.makeVeganMeal(veganOB);
        Meal veganMeal = veganOB.getResult();
        System.out.println("= Vegan Meal Object =:\n" + veganMeal + "\n");

        MealReceiptBuilder veganRB = new MealReceiptBuilder();
        dr.makeVeganMeal(veganRB);
        String veganReceipt = veganRB.getResult();
        System.out.println(veganReceipt + "\n");
    }
}