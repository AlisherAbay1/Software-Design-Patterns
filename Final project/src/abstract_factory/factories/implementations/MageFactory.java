package abstract_factory.factories.implementations;

import abstract_factory.factories.CharacterFactory;
import abstract_factory.products.abstractions.GameCharacter;
import abstract_factory.products.abstractions.Armor;
import abstract_factory.products.abstractions.Weapon;
import abstract_factory.products.implementations.characters.Mage;
import abstract_factory.products.implementations.weapons.MagicStaff;
import abstract_factory.products.implementations.armors.MageRobe;

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
