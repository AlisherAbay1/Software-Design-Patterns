package abstract_fabric.products.abstractions;

public abstract class Warrior {
    public Integer health;
    public String name;
    public Integer attackPower;

    public abstract void attack(Integer weaponPower);
    
    public void takeDamage(int baseDamage, int weaponDamage, int protection) {
        if (baseDamage + weaponDamage <= protection) {
            System.out.println("Attack missed.");
        }
        health -= baseDamage + weaponDamage - protection;
        if (health <= 0) {
            System.out.println(name + " has died");
        } else {
            System.out.println("Current health is " + health);
        }
    }
}