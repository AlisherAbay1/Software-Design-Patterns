package pizza.builder;

import pizza.Pizza;
import pizza.enums.Size;

public abstract class PizzaBuilder {
    protected Pizza pizza = new Pizza();

    public abstract void setSize(Size size);
    public abstract void setDough();
    public abstract void setSauce();
    public abstract void addToppings();
    public abstract void setExtraCheese();
    public abstract void setGlutenFreeDough();
    public abstract void setSpicyLevel();
    public abstract void setVegetarian();

    Pizza getBuildedPizza() {
        Pizza currentPizza = pizza;
        pizza = new Pizza();
        return currentPizza;
    } 
}