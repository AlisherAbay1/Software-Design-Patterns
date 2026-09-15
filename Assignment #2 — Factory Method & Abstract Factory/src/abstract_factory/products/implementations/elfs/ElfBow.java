package abstract_factory.products.implementations.elfs;

import abstract_factory.products.abstractions.*;

public class ElfBow extends Weapon{
    public ElfBow() {
        this.damage = 30;
    }

    @Override 
    public void attackEffect() {
        System.out.println("Elf's bow created fast wind all around.");
    }
}
