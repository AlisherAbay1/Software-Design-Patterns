package abstract_factory.implementations;

import abstract_factory.CharacterFactory;
import base_objects.products.abstractions.Armor;
import base_objects.products.abstractions.GameCharacter;
import base_objects.products.abstractions.Weapon;
import base_objects.products.implementations.armors.MageRobe;
import base_objects.products.implementations.characters.Mage;
import base_objects.products.implementations.weapons.MagicStaff;

public class MageFactory implements CharacterFactory {
    public GameCharacter createCharacter(String name) {
        return new Mage(name);
    }
    public Armor createArmor() {
        return new MageRobe();
    }
    public Weapon createWeapon() {
        return new MagicStaff();
    }
}
