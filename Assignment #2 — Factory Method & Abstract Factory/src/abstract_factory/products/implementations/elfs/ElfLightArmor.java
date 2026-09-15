package abstract_factory.products.implementations.elfs;

import abstract_factory.products.abstractions.*;

public class ElfLightArmor extends Armor{
    public ElfLightArmor() {
        this.protection = 20;
    }

    @Override 
    public void protectionEffect() {
        System.out.println("Elf's armor created beautiful flowers under him.");
    } 
}
