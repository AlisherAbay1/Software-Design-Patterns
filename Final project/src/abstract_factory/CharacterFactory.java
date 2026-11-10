package abstract_factory;

import base_objects.products.abstractions.Armor;
import base_objects.products.abstractions.GameCharacter;
import base_objects.products.abstractions.Weapon;

public interface CharacterFactory {
    public abstract GameCharacter createCharacter(String name);
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
