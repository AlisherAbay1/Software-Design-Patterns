package abstract_factory.products.implementations.weapons;

import abstract_factory.products.abstractions.Weapon;;

public class MagicStaff extends Weapon {
    public MagicStaff() {
        this.damage = 30;
    }
    
    @Override 
    public void attackEffect() {
        System.out.println("Fire ball is flying to enemy");
    }
}
