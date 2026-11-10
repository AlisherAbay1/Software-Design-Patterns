package base_objects.products.abstractions;

public abstract class Armor {
    protected int protection;

    public int getProtection() {
        return this.protection;
    }

    public abstract void protectionEffect();
}
