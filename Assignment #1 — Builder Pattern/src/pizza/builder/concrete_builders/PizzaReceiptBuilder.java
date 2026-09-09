package src.pizza.builder.concrete_builders;

import src.pizza.builder.PizzaBuilder;
import src.pizza.enums.*;

public class PizzaReceiptBuilder implements PizzaBuilder {

    private StringBuilder receipt;

    public PizzaReceiptBuilder() {
        this.reset();
    }

    @Override
    public PizzaBuilder reset() {
        this.receipt = new StringBuilder("[[PIZZA ORDER RECEIPT]]\n");
        return this;
    }

    @Override
    public PizzaBuilder setSize(Size size) {
        if (size != null) {
            this.receipt.append("Size: ").append(size).append("\n");
        }
        return this;
    }

    @Override
    public PizzaBuilder setDough(Dough dough) {
        if (dough != null) {
            this.receipt.append("Dough: ").append(dough).append("\n");
        }
        return this;
    }

    @Override
    public PizzaBuilder setSauce(Sauce sauce) {
        if (sauce != null) {
            this.receipt.append("Sauce: ").append(sauce).append("\n");
        }
        return this;
    }

    @Override
    public PizzaBuilder addTopping(Topping topping) {
        if (topping != null) {
            this.receipt.append("Topping: ").append(topping).append("\n");
        }
        return this;
    }

    @Override
    public PizzaBuilder setExtraCheese(Boolean extraCheese) {
        if (Boolean.TRUE.equals(extraCheese)) {
            this.receipt.append("Extra Cheese: Yes\n");
        }
        return this;
    }

    @Override
    public PizzaBuilder setGlutenFreeDough(Boolean glutenFreeDough) {
        if (Boolean.TRUE.equals(glutenFreeDough)) {
            this.receipt.append("Gluten Free Dough: Yes\n");
        }
        return this;
    }

    @Override
    public PizzaBuilder setSpicyLevel(SpicyLevel spicyLevel) {
        if (spicyLevel != null && spicyLevel != SpicyLevel.NONE) {
            this.receipt.append("Spicy Level: ").append(spicyLevel).append("\n");
        }
        return this;
    }

    @Override
    public PizzaBuilder setVegetarian(Boolean isVegetarian) {
        if (Boolean.TRUE.equals(isVegetarian)) {
            this.receipt.append("Vegetarian: Yes\n");
        }
        return this;
    }

    public String build() {
        String result = this.receipt.toString();
        this.reset();
        return result;
    }
}