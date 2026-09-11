package org.aidar.assignment1;

public class Client{
    public static void main(String[] args) {
        MealDirector dr = new MealDirector();
        
        MealObjectBuilder ob = new MealObjectBuilder();
        dr.makeMeatMeal(ob);
        Meal meatMeal = ob.getResult();

        MealReceiptBuilder rb = new MealReceiptBuilder();
        dr.makeMeatMeal(rb);
        String mealReceipt = rb.getResult();
        System.out.println(mealReceipt);
    }
}