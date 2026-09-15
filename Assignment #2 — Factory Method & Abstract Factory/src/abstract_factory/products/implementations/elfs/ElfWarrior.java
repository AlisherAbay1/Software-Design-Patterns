package abstract_factory.products.implementations.elfs;

import abstract_factory.products.abstractions.*;

public class ElfWarrior extends Warrior {
    public ElfWarrior() {
        this.health = 100;
        this.name = "Elf Warrior";
        this.attackPower = 10;
    }

    @Override 
    public void attack(Integer weaponPower) {
        System.out.println("Elf tried to attack with " + (attackPower + weaponPower) + " attack power ");
    }
}
