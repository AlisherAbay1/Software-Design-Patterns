package pizza.builder;

import pizza.enums.*;

public interface PizzaBuilder {
    PizzaBuilder reset();
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder setSauce(Sauce sauce);
    PizzaBuilder addTopping(Topping topping);
    PizzaBuilder setExtraCheese(Boolean extraCheese);
    PizzaBuilder setGlutenFreeDough(Boolean glutenFreeDough);
    PizzaBuilder setSpicyLevel(SpicyLevel spicyLevel);
    PizzaBuilder setVegetarian(Boolean isVegetarian);
}