package abstract_fabric.products.implementations.elves;

import abstract_fabric.products.abstractions.*;

public class ElfLightArmor extends Armor{
    public ElfLightArmor() {
        this.protection = 20;
    }
    public void protectionEffect() {
        System.out.println("Elf's armor created beautiful flowers under him.");
    } 
}
