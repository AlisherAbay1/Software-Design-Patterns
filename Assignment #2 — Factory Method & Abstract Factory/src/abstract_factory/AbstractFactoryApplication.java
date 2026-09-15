package abstract_factory;

import abstract_factory.factories.*;
import abstract_factory.products.abstractions.*;

public class AbstractFactoryApplication {
    private RaceFactory factory;
    public AbstractFactoryApplication(RaceFactory factory) {
        this.factory = factory;
    }

    public Warrior getWarrior() {
        Warrior warrior = factory.createWarrior();
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();

        warrior.equip(weapon, armor);
        return warrior;
    }
}
