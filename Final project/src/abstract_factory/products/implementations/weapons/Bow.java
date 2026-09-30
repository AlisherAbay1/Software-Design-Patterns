package abstract_factory.products.implementations.weapons;

import abstract_factory.products.abstractions.Weapon;;

public class Bow extends Weapon {
    public Bow() {
        this.damage = 20;
    }

    @Override 
    public void attackEffect() {
        System.out.println("Arrow is flying to enemy");
    }
}
