package abstract_fabric.products.implementations.orcs;

import abstract_fabric.products.abstractions.*;

public class OrcWarrior extends Warrior{
    public OrcWarrior() {
        this.health = 200;
        this.name = "Ork Warrior";
        this.attackPower = 20;
    }

    @Override 
    public void attack(Integer weaponPower) {
        System.out.println("Elf tried to attack with " + (attackPower + weaponPower) + " attack power ");
    }
}
