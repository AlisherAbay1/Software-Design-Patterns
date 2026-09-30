package abstract_factory.products.abstractions;

public abstract class Weapon {
    protected int damage; 

    public int getDamage() {
        return this.damage;
    }

    public abstract void attackEffect();
}
