package abstract_factory.products.implementations.orcs;

import abstract_factory.products.abstractions.*;

public class OrcWarrior extends Warrior{
    public OrcWarrior() {
        this.health = 200;
        this.name = "Ork Warrior";
        this.attackPower = 20;
    }

    @Override 
    public void attack(Warrior warrior) {
        int weaponDamage = (this.weapon != null) ? this.weapon.damage : 0;
        int damage = attackPower + weaponDamage;
        System.out.println("Orc tried to attack with " + damage + " attack power.");
        warrior.takeDamage(damage);
    }
}
