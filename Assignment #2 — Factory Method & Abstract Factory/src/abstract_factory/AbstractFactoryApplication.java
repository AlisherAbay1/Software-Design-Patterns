package abstract_factory;

import abstract_factory.factories.*;
import abstract_factory.products.abstractions.*;

public class AbstractFactoryApplication {
    private RaceFactory factory;
    public AbstractFactoryApplication(RaceFactory factory) {
        this.factory = factory;
    }

    public void showAbstractFactoryWork() {
        Warrior warrior = factory.createWarrior();
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();

        warrior.attack(weapon.damage);
        warrior.takeDamage(20, 30, armor.protection);
        warrior.takeDamage(20, 30, armor.protection);
        armor.protectionEffect();
        weapon.attackEffect();
    }
}
