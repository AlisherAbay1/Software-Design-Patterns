package src.pizza.builder;

import src.pizza.enums.*;

public class PizzaDirector {

    public void makePepperoni(PizzaBuilder builder, Size size) {
        builder.reset()
               .setSize(size)
               .setDough(Dough.THIN)
               .setSauce(Sauce.TOMATO)
               .addTopping(Topping.MOZZARELLA)
               .addTopping(Topping.PEPPERONI)
               .setSpicyLevel(SpicyLevel.MILD)
               .setVegetarian(false);
    }

    public void makeHawaiian(PizzaBuilder builder, Size size) {
        builder.reset()
               .setSize(size)
               .setDough(Dough.THIN)
               .setSauce(Sauce.TOMATO)
               .addTopping(Topping.MOZZARELLA)
               .addTopping(Topping.HAM)
               .addTopping(Topping.PINEAPPLE)
               .setVegetarian(false);
    }

    public void makeMargherita(PizzaBuilder builder, Size size) {
        builder.reset()
               .setSize(size)
               .setDough(Dough.THIN)
               .setSauce(Sauce.TOMATO)
               .addTopping(Topping.MOZZARELLA)
               .addTopping(Topping.BASIL)
               .setVegetarian(true);
    }
}