package abstract_fabric.fabrics.implementations;

import abstract_fabric.fabrics.*;
import abstract_fabric.products.implementations.elfs.*;
import abstract_fabric.products.abstractions.*;

public class ElfFabric implements RaceFabric {
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
