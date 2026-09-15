package abstract_fabric.products.implementations.orcs;

import abstract_fabric.products.abstractions.*;

public class OrcAxe extends Weapon {
    public OrcAxe() {
        this.damage = 20;
    }

    @Override 
    public void attackEffect() {
        System.out.println("Ork's axe created a lot of fire around.");
    }
}
