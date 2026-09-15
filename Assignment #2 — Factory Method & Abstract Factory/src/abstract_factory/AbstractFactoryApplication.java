package abstract_factory;

import abstract_factory.factories.*;
import abstract_factory.products.abstractions.*;

public class AbstractFactoryApplication {
    private RaceFactory factory;
    public AbstractFactoryApplication(RaceFactory factory) {
        this.factory = factory;
    }

    public Warrior getWarrior() {
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        Warrior warrior = factory.createWarrior(weapon, armor);
        return warrior;
    }
}
