package abstract_fabric.products.implementations.elves;

import abstract_fabric.products.abstractions.*;

public class ElfBow extends Weapon{
    public ElfBow() {
        this.damage = 30;
    }
    public void attackEffect() {
        System.out.println("Elf's bow created fast wind all around.");
    }
}
