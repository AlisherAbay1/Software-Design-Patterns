package abstract_factory.factories.implementations;

import abstract_factory.factories.CharacterFactory;
import abstract_factory.products.abstractions.GameCharacter;
import abstract_factory.products.abstractions.Armor;
import abstract_factory.products.abstractions.Weapon;
import abstract_factory.products.implementations.armors.LightArmor;
import abstract_factory.products.implementations.characters.Archer;
import abstract_factory.products.implementations.weapons.Bow;


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
