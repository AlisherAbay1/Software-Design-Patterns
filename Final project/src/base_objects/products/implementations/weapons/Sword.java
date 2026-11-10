package base_objects.products.implementations.weapons;

import base_objects.products.abstractions.Weapon;;

public class Sword extends Weapon {
    public Sword() {
        this.damage = 25;
    }

    @Override 
    public void attackEffect() {
        System.out.println("The sword slices through the air toward the enemy.");
    }
}
