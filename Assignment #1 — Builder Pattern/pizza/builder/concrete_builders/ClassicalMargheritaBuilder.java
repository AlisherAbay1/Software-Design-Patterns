package pizza.builder.concrete_builders;

import pizza.Pizza;
import pizza.builder.PizzaBuilder;
import pizza.enums.*;

public class ClassicalMargheritaBuilder extends PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void setSize(Size size) {
        pizza.setSize(Size.MEDIUM);
    }

    @Override
    public void setDough() {
        pizza.setDough(Dough.THIN);
    }

    @Override
    public void setSauce() {
        pizza.setSauce(Sauce.TOMATO);
    }

    @Override
    public void addToppings() {
        pizza.addTopping(Topping.MOZZARELLA);
        pizza.addTopping(Topping.BASIL);
    }

    @Override
    public void setExtraCheese() {
        pizza.setExtraCheese(false);
    }

    @Override
    public void setGlutenFreeDough() {
        pizza.setGlutenFreeDough(false);
    }

    @Override
    public void setSpicyLevel() {
        pizza.setSpicyLevel(SpicyLevel.NONE);
    }

    @Override
    public void setVegetarian() {
        pizza.setVegetarian(true);
    }
}