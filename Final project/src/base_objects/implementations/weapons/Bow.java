package base_objects.implementations.weapons;

import base_objects.abstractions.Weapon;;

public class Bow extends Weapon {
    public Bow() {
        this.damage = 20;
    }

    @Override 
    public void attackEffect() {
        System.out.println("Arrow is flying to enemy");
    }
}
