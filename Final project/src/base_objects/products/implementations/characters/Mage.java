package base_objects.products.implementations.characters;

import base_objects.products.abstractions.GameCharacter;

public class Mage extends GameCharacter {
    public Mage(String name) {
        this.name = name;
        this.role = "Mage";
        this.health = 90;
        this.attackPower = 15;
    }
}
