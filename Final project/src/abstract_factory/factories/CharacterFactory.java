package abstract_factory.factories;

import abstract_factory.products.abstractions.GameCharacter;
import abstract_factory.products.abstractions.Armor;
import abstract_factory.products.abstractions.Weapon;

public interface CharacterFactory {
    public abstract GameCharacter createCharacter(String name);
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
