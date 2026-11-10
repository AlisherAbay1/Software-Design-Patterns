package base_objects.products.implementations.armors;

import base_objects.products.abstractions.Armor;

public class HeavyArmor extends Armor {
    public HeavyArmor() {
        this.protection = 15;
    }

    @Override
    public void protectionEffect() {
        System.out.println("Heavy armor got some scratches.");
    }
}
