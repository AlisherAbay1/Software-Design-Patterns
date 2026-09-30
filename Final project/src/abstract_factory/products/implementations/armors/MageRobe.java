package abstract_factory.products.implementations.armors;

import abstract_factory.products.abstractions.Armor;

public class MageRobe extends Armor {
    public MageRobe() {
        this.protection = 5;
    }

    @Override
    public void protectionEffect() {
        System.out.println("Mage robe tore a bit.");
    }
}
