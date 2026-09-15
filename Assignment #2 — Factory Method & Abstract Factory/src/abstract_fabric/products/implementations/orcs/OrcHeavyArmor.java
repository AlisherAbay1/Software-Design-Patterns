package abstract_fabric.products.implementations.orcs;

import abstract_fabric.products.abstractions.*;

public class OrcHeavyArmor extends Armor{
    public OrcHeavyArmor() {
        this.protection = 20;
    }

    @Override 
    public void protectionEffect() {
        System.out.println("Ork's armor created blood under him.");
    } 
}
