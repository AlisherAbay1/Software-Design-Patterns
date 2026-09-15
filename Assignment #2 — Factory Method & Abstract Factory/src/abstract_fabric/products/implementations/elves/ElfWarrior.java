package abstract_fabric.products.implementations.elves;

import abstract_fabric.products.abstractions.*;

public class ElfWarrior extends Warrior {
    public ElfWarrior() {
        this.health = 100;
        this.name = "Elf Warrior";
        this.attackPower = 10;
    }

    @Override 
    public void attack() {
        System.out.println("Elf tried to attack with base attack power " + attackPower);
    }
}
