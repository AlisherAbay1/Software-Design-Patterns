package abstract_factory.factories;

import abstract_factory.products.abstractions.*;

public interface RaceFactory {
    public abstract Warrior createWarrior(Weapon weapon, Armor armor);
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}