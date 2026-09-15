import fabric_method.FabricMethodApplication;
import abstract_factory.AbstractFactoryApplication;
import abstract_factory.factories.implementations.*;

public class Main {
    public static void main(String[] args) {
        printPatternsSeparator("Fabric method");

        String[] configValues = {"Truck", "Ship"};
        FabricMethodApplication transportDemo = new FabricMethodApplication();
        for (String config: configValues) {
            transportDemo.showFabricMethodWork(config);
        }

        printPatternsSeparator("Abstract Factory");

        AbstractFactoryApplication elfDemo = new AbstractFactoryApplication(new ElfFactory());
        AbstractFactoryApplication orcDemo = new AbstractFactoryApplication(new OrcFactory());
        elfDemo.showAbstractFactoryWork();

        System.out.print("\n");
        printLineSeparator();
        System.out.print("\n");

        orcDemo.showAbstractFactoryWork();
    }

    public static void printLineSeparator() {
        System.out.println("-".repeat(50));
    }

    public static void printPatternsSeparator(String factoryName) {
        System.out.print("\n");
        printLineSeparator();
        System.out.println(factoryName);
        printLineSeparator();
        System.out.print("\n");
    }
}