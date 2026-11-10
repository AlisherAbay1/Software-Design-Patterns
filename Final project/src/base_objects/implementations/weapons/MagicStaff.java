package base_objects.implementations.weapons;

import base_objects.abstractions.Weapon;;

public class MagicStaff extends Weapon {
    public MagicStaff() {
        this.damage = 30;
    }
    
    @Override 
    public void attackEffect() {
        System.out.println("Fire ball is flying to enemy");
    }
}
