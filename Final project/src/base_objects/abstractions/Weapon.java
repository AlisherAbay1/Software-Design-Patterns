package base_objects.abstractions;

public abstract class Weapon {
    protected int damage; 

    public int getDamage() {
        return this.damage;
    }

    public abstract void attackEffect();
}
