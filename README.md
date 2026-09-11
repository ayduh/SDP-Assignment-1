# SDP-Assignment-1

This project implements the "Builder Pattern".
The main idea is to get two different representations of one Product (Meal).

How to run the project:
1) Open preferred IDE
2) Open the root directory of this project
3) Go to "src/main/java/org/aidar/assignment1/Client.java"
4) Right-click the Client.java and click Run (with or without debugging)

- "Meal" class is responsible for defining fields of our future product (Main/Side Dish, Drink)
- "MealBuilder" interface is made for defining methods that our Concrete Builder will implement (our API)
- "MealObjectBuilder" is responsible for Object representation of our Product
- "MealReceiptBuilder" is responsible for String Representation of our Product
- "MealDirector" class is for preparing some out-of-the-box configurations for our product (e.g. There is a popular dish set)
- "Client" is our entry point to the program that defines the order of output of our product configurations and their representations
