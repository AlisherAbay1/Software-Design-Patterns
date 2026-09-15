package abstract_factory.products.implementations.orcs;

import abstract_factory.products.abstractions.*;

public class OrcAxe extends Weapon {
    public OrcAxe() {
        this.damage = 20;
    }

    @Override 
    public void attackEffect() {
        System.out.println("Orc's axe created a lot of fire around.");
    }
}
