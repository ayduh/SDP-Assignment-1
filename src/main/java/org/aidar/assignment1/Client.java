package org.aidar.assignment1;

public class Client{
    public static void main(String[] args) {
        MealDirector dr = new MealDirector();
        
        MealObjectBuilder ob = new MealObjectBuilder();
        dr.makeMeatMeal(ob);
        Meal meatMeal = ob.getResult();

        MealReceiptBuilder receiptBuilder = new MealReceiptBuilder();
        dr.makeMeatMeal(ob);
        String mealReceipt = receiptBuilder.getResult();
        System.out.println(mealReceipt);
    }
}