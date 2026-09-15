package abstract_fabric.products.implementations.orcs;

import abstract_fabric.products.abstractions.*;

public class OrcWarrior extends Warrior{
    public OrcWarrior() {
        this.health = 200;
        this.name = "Ork Warrior";
        this.attackPower = 20;
    }

    @Override 
    public void attack() {
        System.out.println("Ork tried to attack with base attack power " + attackPower);
    }
}
