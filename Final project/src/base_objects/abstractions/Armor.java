package base_objects.abstractions;

public abstract class Armor {
    protected int protection;

    public int getProtection() {
        return this.protection;
    }

    public abstract void protectionEffect();
}
