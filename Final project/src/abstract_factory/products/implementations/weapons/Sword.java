package abstract_factory.products.implementations.weapons;

import abstract_factory.products.abstractions.Weapon;;

public class Sword extends Weapon {
    public Sword() {
        this.damage = 25;
    }

    @Override 
    public void attackEffect() {
        System.out.println("The sword slices through the air toward the enemy.");
    }
}
