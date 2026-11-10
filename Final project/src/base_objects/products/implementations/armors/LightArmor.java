package base_objects.products.implementations.armors;

import base_objects.products.abstractions.Armor;

public class LightArmor extends Armor {
    public LightArmor() {
        this.protection = 10;
    }

    @Override
    public void protectionEffect() {
        System.out.println("Light armor got a lot of scratches.");
    }
}
