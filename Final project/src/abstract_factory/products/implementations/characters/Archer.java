package abstract_factory.products.implementations.characters;

import abstract_factory.products.abstractions.GameCharacter;

public class Archer extends GameCharacter {
    public Archer(String name) {
        this.name = name;
        this.role = "Archer";
        this.health = 100;
        this.attackPower = 10;
    }
}
