package abstract_factory.factories.implementations;

import abstract_factory.factories.*;
import abstract_factory.products.abstractions.*;
import abstract_factory.products.implementations.orcs.*;

public class OrcFactory implements RaceFactory {
    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Armor createArmor() {
        return new OrcHeavyArmor();
    }
    @Override
    public Weapon createWeapon() {
        return new OrcAxe();
    }
}
