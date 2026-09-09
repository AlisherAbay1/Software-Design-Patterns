package pizza.builder;

import pizza.Pizza;
import pizza.enums.Size;

public abstract class PizzaBuilder {
    protected Pizza pizza;
    public PizzaBuilder() {
        this.reset();
    }

    public abstract PizzaBuilder setSize(Size size);
    public abstract PizzaBuilder setDough();
    public abstract PizzaBuilder setSauce();
    public abstract PizzaBuilder addToppings();
    public abstract PizzaBuilder setExtraCheese();
    public abstract PizzaBuilder setGlutenFreeDough();
    public abstract PizzaBuilder setSpicyLevel();
    public abstract PizzaBuilder setVegetarian();

    public Pizza getBuildedPizza() {
        Pizza currentPizza = pizza;
        this.reset();
        return currentPizza;
    } 

    public void reset() {
        this.pizza = new Pizza();
    }
}