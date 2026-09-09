package pizza.builder.concrete_builders;

import pizza.builder.PizzaBuilder;
import pizza.enums.*;

public class ClassicalHawaiianBuilder extends PizzaBuilder {

    @Override
    public PizzaBuilder setSize(Size size) {
        this.pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder setDough() {
        this.pizza.setDough(Dough.THIN);
        return this;
    }

    @Override
    public PizzaBuilder setSauce() {
        this.pizza.setSauce(Sauce.TOMATO);
        return this;
    }

    @Override
    public PizzaBuilder addToppings() {
        this.pizza.addTopping(Topping.HAM);
        this.pizza.addTopping(Topping.PINEAPPLE);
        this.pizza.addTopping(Topping.MOZZARELLA);
        return this;
    }

    @Override
    public PizzaBuilder setExtraCheese() {
        this.pizza.setExtraCheese(false);
        return this;
    }

    @Override
    public PizzaBuilder setGlutenFreeDough() {
        this.pizza.setGlutenFreeDough(false);
        return this;
    }

    @Override
    public PizzaBuilder setSpicyLevel() {
        this.pizza.setSpicyLevel(SpicyLevel.NONE);
        return this;
    }

    @Override
    public PizzaBuilder setVegetarian() {
        this.pizza.setVegetarian(false);
        return this;
    }
}