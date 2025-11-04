package com.luv2code.designpatterns.creational.builder;

import java.util.Objects;

public class Meal {

    // Required
    private final Burger burger;

    // Optional
    private final Drink drink;
    private final Fries fries;

    // Private meal constructor used only by the Builder
    private Meal(Builder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.fries = builder.fries;
    }

    // Static inner Builder for constructing Meal objects
    public static class Builder {

        // Required
        private final Burger burger;

        // Optional
        private Drink drink;
        private Fries fries;

        // Builder constructor for required field
        public Builder(Burger burger) {
            this.burger = Objects.requireNonNull(burger, "burger must not be null");
        }

        // Setter for optional drink
        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        // Setter for optional fries
        public Builder fries(Fries fries) {
            this.fries = fries;
            return this;
        }

        // Builds the Meal instance
        public Meal build() {
            return new Meal(this);
        }
    }

    /*
    // Returns a string representation of the Meal
    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", fries=" + fries +
                '}';
    }
    */

    // Returns a string representation of the Meal
    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + displayValue(drink) +
                ", fries=" + displayValue(fries) +
                '}';
    }

    private String displayValue(Object value) {
        return Objects.toString(value, "None");
    }

    // Getters to access the values set via the Builder
    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public Fries getFries() {
        return fries;
    }

}






