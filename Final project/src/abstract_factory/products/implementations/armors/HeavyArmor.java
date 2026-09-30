package abstract_factory.products.implementations.armors;

import abstract_factory.products.abstractions.Armor;

public class HeavyArmor extends Armor {
    public HeavyArmor() {
        this.protection = 15;
    }

    @Override
    public void protectionEffect() {
        System.out.println("Heavy armor got some scratches.");
    }
}
