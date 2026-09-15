package abstract_fabric;

import abstract_fabric.fabrics.*;
import abstract_fabric.products.abstractions.*;

public class AbstractFabricApplication {
    private RaceFabric fabric;
    public AbstractFabricApplication(RaceFabric fabric) {
        this.fabric = fabric;
    }
    public void showAbstractFabricWork() {
        Warrior warrior = fabric.createWarrior();
        Weapon weapon = fabric.createWeapon();
        Armor armor = fabric.createArmor();

        warrior.attack(weapon.damage);
        warrior.takeDamage(20, 30, armor.protection);
        warrior.takeDamage(20, 30, armor.protection);
        armor.protectionEffect();
        weapon.attackEffect();
    }
}
