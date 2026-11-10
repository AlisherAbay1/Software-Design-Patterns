package base_objects.implementations.characters;

import base_objects.abstractions.GameCharacter;

public class Archer extends GameCharacter {
    public Archer(String name) {
        this.name = name;
        this.role = "Archer";
        this.health = 100;
        this.attackPower = 10;
    }
}
