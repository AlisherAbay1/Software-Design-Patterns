package abstract_factory.products.implementations.orcs;

import abstract_factory.products.abstractions.*;

public class OrcWarrior extends Warrior{
    public OrcWarrior(Weapon weapon, Armor armor) {
        this.health = 200;
        this.name = "Ork Warrior";
        this.attackPower = 20;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override 
    public void attack(Warrior warrior) {
        int damage = attackPower + this.weapon.damage;
        System.out.println("Orc tried to attack with " + damage + " attack power.");
        warrior.takeDamage(damage);
    }
}
