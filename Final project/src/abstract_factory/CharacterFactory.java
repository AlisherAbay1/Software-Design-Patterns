package abstract_factory;

import base_objects.abstractions.Armor;
import base_objects.abstractions.GameCharacter;
import base_objects.abstractions.Weapon;

public interface CharacterFactory {
    public abstract GameCharacter createCharacter(String name);
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
