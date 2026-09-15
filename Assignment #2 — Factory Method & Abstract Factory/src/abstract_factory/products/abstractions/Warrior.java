package abstract_factory.products.abstractions;

public abstract class Warrior {
    public Integer health;
    public String name;
    public Integer attackPower;
    public Armor armor;
    public Weapon weapon;

    public abstract void attack(Warrior warrior);

    public void equip(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public void takeDamage(int damage) {
        int protection = (armor != null) ? armor.protection : 0;

        if (damage <= protection) {
            System.out.println("Attack missed.");
            return;
        }
        health -= damage - protection;
        if (health <= 0) {
            System.out.println(name + " has died");
        } else {
            System.out.println("Current health is " + health);
        }
    }
}