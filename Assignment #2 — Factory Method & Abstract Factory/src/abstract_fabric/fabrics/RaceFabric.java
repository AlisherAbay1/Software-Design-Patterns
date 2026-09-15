package abstract_fabric.fabrics;

import abstract_fabric.products.abstractions.*;

public interface RaceFabric {
    public abstract Warrior createWarrior();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}