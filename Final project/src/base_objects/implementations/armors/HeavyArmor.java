package base_objects.implementations.armors;

import base_objects.abstractions.Armor;

public class HeavyArmor extends Armor {
    public HeavyArmor() {
        this.protection = 15;
    }

    @Override
    public void protectionEffect() {
        System.out.println("Heavy armor got some scratches.");
    }
}
