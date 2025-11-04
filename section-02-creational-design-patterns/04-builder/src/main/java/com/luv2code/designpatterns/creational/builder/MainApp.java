package com.luv2code.designpatterns.creational.builder;

public class MainApp {

    public static void main(String[] args) {

        // Create meal with required burger and optional drink
        Meal meal1 = new Meal.Builder(Burger.VEG)
                .drink(Drink.COKE)
                .build();

        System.out.println(meal1);

        // Create meal with required burger, optional drink and fries
        Meal meal2 = new Meal.Builder(Burger.CHEESE_BURGER)
                .drink(Drink.LEMONADE)
                .fries(Fries.FRENCH_FRIES)
                .build();

        System.out.println(meal2);

    }
}









