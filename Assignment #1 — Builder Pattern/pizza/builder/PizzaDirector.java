package pizza.builder;

import pizza.Pizza;
import pizza.enums.Size;

public class PizzaDirector {

    public Pizza makeSmallPizza(PizzaBuilder builder) {
        return builder
                .setSize(Size.SMALL)
                .setDough()
                .setSauce()
                .addToppings()
                .setExtraCheese()
                .setGlutenFreeDough()
                .setSpicyLevel()
                .setVegetarian()
                .getBuildedPizza();
    }

    public Pizza makeMediumPizza(PizzaBuilder builder) {
        return builder
                .setSize(Size.MEDIUM)
                .setDough()
                .setSauce()
                .addToppings()
                .setExtraCheese()
                .setGlutenFreeDough()
                .setSpicyLevel()
                .setVegetarian()
                .getBuildedPizza();
    }

    public Pizza makeLargePizza(PizzaBuilder builder) {
        return builder
                .setSize(Size.LARGE)
                .setDough()
                .setSauce()
                .addToppings()
                .setExtraCheese()
                .setGlutenFreeDough()
                .setSpicyLevel()
                .setVegetarian()
                .getBuildedPizza();
    }
}