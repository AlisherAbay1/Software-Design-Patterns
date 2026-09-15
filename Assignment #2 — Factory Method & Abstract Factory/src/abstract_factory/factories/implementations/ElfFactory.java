package abstract_factory.factories.implementations;

import abstract_factory.factories.*;
import abstract_factory.products.abstractions.*;
import abstract_factory.products.implementations.elfs.*;

public class ElfFactory implements RaceFactory {
    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Armor createArmor() {
        return new ElfLightArmor();
    }
    @Override
    public Weapon createWeapon() {
        return new ElfBow();
    }
}
