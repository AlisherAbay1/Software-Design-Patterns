package pizza.builder;

import pizza.Pizza;

public interface PizzaBuilder {
    void setSize();
    void setDough();
    void setSauce();
    void addToppings();
    void setExtraCheese();
    void setGlutenFreeDough();
    void setSpicyLevel();
    void setVegetarian();

    Pizza build();
}