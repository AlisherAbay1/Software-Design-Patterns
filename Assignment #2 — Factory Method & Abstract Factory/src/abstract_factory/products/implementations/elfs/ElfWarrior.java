package abstract_factory.products.implementations.elfs;

import abstract_factory.products.abstractions.*;

public class ElfWarrior extends Warrior {
    public ElfWarrior(Weapon weapon, Armor armor) {
        this.health = 100;
        this.name = "Elf Warrior";
        this.attackPower = 10;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override 
    public void attack(Warrior warrior) {
        int damage = attackPower + this.weapon.damage;
        System.out.println("Elf tried to attack with " + damage + " attack power.");
        warrior.takeDamage(damage);
    }
}
