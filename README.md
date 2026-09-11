# SDP-Assignment-1

This project implements the "Builder Pattern".
The main idea is to get two different representations of one Product (Meal).

- "Meal" class is responsible for defining fields of our future product (Main/Side Dish, Drink)
- "MealBuilder" interface is made for defining methods that our Concrete Builder will implement (our API)
- "MealObjectBuilder" is responsible for Object representation of our Product
- "MealReceiptBuilder" is responsible for String Representation of our Product
- "MealDirector" class is for preparing some out-of-the-box configurations for our product (e.g. There is a popular dish set)
- "Client" is our entry point to the program that defines the order of output of our product configurations and their representations
