import abstract_factory.AbstractFactoryApplication;
import abstract_factory.factories.implementations.*;
import abstract_factory.products.abstractions.*;
import factory_method.FactoryMethodApplication;

public class Main {
    public static void main(String[] args) {
        printPatternsSeparator("Fabric method");

        String[] configValues = {"Truck", "Ship"};
        FactoryMethodApplication transportDemo = new FactoryMethodApplication();
        for (String config: configValues) {
            transportDemo.showFabricMethodWork(config);
        }

        printPatternsSeparator("Abstract Factory");

        AbstractFactoryApplication elfDemo = new AbstractFactoryApplication(new ElfFactory());
        AbstractFactoryApplication orcDemo = new AbstractFactoryApplication(new OrcFactory());

        Warrior elf = elfDemo.getWarrior();
        Warrior orc = orcDemo.getWarrior();

        System.out.println(elf.name + " vs " + orc.name);
        System.out.println();

        elf.weapon.attackEffect();
        elf.armor.protectionEffect();
        orc.weapon.attackEffect();
        orc.armor.protectionEffect();
        System.out.println();

        while (elf.health > 0 && orc.health > 0) {
            elf.attack(orc);
            if (orc.health <= 0) break;

            orc.attack(elf);
        }

        System.out.println();
        String winner = elf.health > 0 ? elf.name : orc.name;
        System.out.println(winner + " wins!");
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