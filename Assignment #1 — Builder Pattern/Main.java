import pizza.builder.PizzaDirector;
import pizza.builder.concrete_builders.*;
import pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        
        Pizza smallClassicalHawaiian = director.makeSmallPizza(new ClassicalHawaiianBuilder());
        Pizza mediumClassicalMargherita = director.makeMediumPizza(new ClassicalMargheritaBuilder());
        Pizza largeClassicalPepperoni = director.makeLargePizza(new ClassicalPepperoniBuilder());

        System.out.println(smallClassicalHawaiian);
        System.out.println(mediumClassicalMargherita);
        System.out.println(largeClassicalPepperoni);
    }
}
