package abstract_factory.products.implementations.characters;

import abstract_factory.products.abstractions.GameCharacter;

public class Mage extends GameCharacter {
    public Mage(String name) {
        this.name = name;
        this.role = "Mage";
        this.health = 90;
        this.attackPower = 15;
    }
}
