package abstract_factory.products.implementations.characters;

import abstract_factory.products.abstractions.GameCharacter;

public class Warrior extends GameCharacter {
    public Warrior(String name) {
        this.name = name;
        this.role = "Warrior";
        this.health = 80;
        this.attackPower = 20;
    }
}
