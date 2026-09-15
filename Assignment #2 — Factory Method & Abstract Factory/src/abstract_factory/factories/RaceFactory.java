package abstract_factory.factories;

import abstract_factory.products.abstractions.*;

public interface RaceFactory {
    public abstract Warrior createWarrior();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}