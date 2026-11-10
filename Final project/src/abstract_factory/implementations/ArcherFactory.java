package abstract_factory.implementations;

import abstract_factory.CharacterFactory;
import base_objects.products.abstractions.Armor;
import base_objects.products.abstractions.GameCharacter;
import base_objects.products.abstractions.Weapon;
import base_objects.products.implementations.armors.LightArmor;
import base_objects.products.implementations.characters.Archer;
import base_objects.products.implementations.weapons.Bow;


public class ArcherFactory implements CharacterFactory {
    public GameCharacter createCharacter(String name) {
        return new Archer(name);
    }
    public Armor createArmor() {
        return new LightArmor();
    }
    public Weapon createWeapon() {
        return new Bow();
    }
}
