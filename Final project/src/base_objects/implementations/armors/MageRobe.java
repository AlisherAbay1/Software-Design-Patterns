package base_objects.implementations.armors;

import base_objects.abstractions.Armor;

public class MageRobe extends Armor {
    public MageRobe() {
        this.protection = 5;
    }

    @Override
    public void protectionEffect() {
        System.out.println("Mage robe tore a bit.");
    }
}
