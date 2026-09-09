package pizza.builder.concrete_builders;

import pizza.Pizza;
import pizza.builder.PizzaBuilder;
import pizza.enums.*;

public class PizzaObjectBuilder implements PizzaBuilder {

    private Pizza pizza;

    public PizzaObjectBuilder() {
        this.reset();
    }

    @Override
    public PizzaBuilder reset() {
        this.pizza = new Pizza();
        return this;
    }

    @Override
    public PizzaBuilder setSize(Size size) {
        this.pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder setDough(Dough dough) {
        this.pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder setSauce(Sauce sauce) {
        this.pizza.setSauce(sauce);
        return this;
    }

    @Override
    public PizzaBuilder addTopping(Topping topping) {
        this.pizza.addTopping(topping);
        return this;
    }

    @Override
    public PizzaBuilder setExtraCheese(Boolean extraCheese) {
        this.pizza.setExtraCheese(extraCheese);
        return this;
    }

    @Override
    public PizzaBuilder setGlutenFreeDough(Boolean glutenFreeDough) {
        this.pizza.setGlutenFreeDough(glutenFreeDough);
        return this;
    }

    @Override
    public PizzaBuilder setSpicyLevel(SpicyLevel spicyLevel) {
        this.pizza.setSpicyLevel(spicyLevel);
        return this;
    }

    @Override
    public PizzaBuilder setVegetarian(Boolean isVegetarian) {
        this.pizza.setVegetarian(isVegetarian);
        return this;
    }

    public Pizza build() {
        Pizza result = this.pizza;
        this.reset();
        return result;
    }
}