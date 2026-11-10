package abstract_factory.implementations;

import abstract_factory.CharacterFactory;
import base_objects.products.abstractions.Armor;
import base_objects.products.abstractions.GameCharacter;
import base_objects.products.abstractions.Weapon;
import base_objects.products.implementations.armors.HeavyArmor;
import base_objects.products.implementations.characters.Warrior;
import base_objects.products.implementations.weapons.Sword;

public class WarriorFactory implements CharacterFactory {
    public GameCharacter createCharacter(String name) {
        return new Warrior(name);
    }
    public Armor createArmor() {
        return new HeavyArmor();
    }
    public Weapon createWeapon() {
        return new Sword();
    }
}
