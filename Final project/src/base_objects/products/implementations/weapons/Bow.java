package base_objects.products.implementations.weapons;

import base_objects.products.abstractions.Weapon;;

public class Bow extends Weapon {
    public Bow() {
        this.damage = 20;
    }

    @Override 
    public void attackEffect() {
        System.out.println("Arrow is flying to enemy");
    }
}
