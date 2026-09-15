package abstract_fabric.fabrics.implementations;

import abstract_fabric.fabrics.*;
import abstract_fabric.products.implementations.orcs.*;
import abstract_fabric.products.abstractions.*;

public class OrcFabric implements RaceFabric {
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
