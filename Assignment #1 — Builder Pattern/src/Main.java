package src;
import src.pizza.Pizza;
import src.pizza.builder.PizzaDirector;
import src.pizza.builder.concrete_builders.PizzaObjectBuilder;
import src.pizza.builder.concrete_builders.PizzaReceiptBuilder;
import src.pizza.enums.Size;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();


        PizzaObjectBuilder pizzaBuilder = new PizzaObjectBuilder();

        director.makeHawaiian(pizzaBuilder, Size.SMALL);
        Pizza smallHawaiian = pizzaBuilder.build();

        director.makeMargherita(pizzaBuilder, Size.MEDIUM);
        Pizza mediumMargherita = pizzaBuilder.build();

        director.makePepperoni(pizzaBuilder, Size.LARGE);
        Pizza largePepperoni = pizzaBuilder.build();

        System.out.println("[OBJECT REPRESENTATIONS]");
        System.out.println(smallHawaiian);
        System.out.println(mediumMargherita);
        System.out.println(largePepperoni);
        

        PizzaReceiptBuilder receiptBuilder = new PizzaReceiptBuilder();

        director.makePepperoni(receiptBuilder, Size.LARGE);
        String pepperoniReceipt = receiptBuilder.build();

        System.out.println("\n[TEXT REPRESENTATION]");
        System.out.println(pepperoniReceipt);
    }
}