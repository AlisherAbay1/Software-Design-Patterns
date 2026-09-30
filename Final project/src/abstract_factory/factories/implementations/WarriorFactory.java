package abstract_factory.factories.implementations;

import abstract_factory.factories.CharacterFactory;
import abstract_factory.products.abstractions.GameCharacter;
import abstract_factory.products.abstractions.Armor;
import abstract_factory.products.abstractions.Weapon;
import abstract_factory.products.implementations.characters.Warrior;
import abstract_factory.products.implementations.weapons.Sword;
import abstract_factory.products.implementations.armors.HeavyArmor;

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
