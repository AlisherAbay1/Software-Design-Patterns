import pizza.Pizza;
import pizza.builder.PizzaDirector;
import pizza.builder.concrete_builders.PizzaObjectBuilder;
import pizza.builder.concrete_builders.PizzaReceiptBuilder;
import pizza.enums.Size;

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