package abstract_factory.products.abstractions;

public abstract class GameCharacter {
    protected String name;
    protected String role;
    protected int health;
    protected int attackPower;
    protected Armor armor;
    protected Weapon weapon;

    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void takeDamage(int damage) {
        if (!isAlive()) {
            System.out.println("(S)he is already dead, stop attacking.");
            return;
        }

        int protection = 0;
        if (armor != null) {
            protection = armor.getProtection();
            armor.protectionEffect();
        }

        if (damage <= protection) {
            System.out.println("Attack missed.");
            return;
        }
        health -= damage - protection;
        if (!isAlive()) {
            System.out.println(name + " has died");
        } else {
            System.out.println("Current health is " + health);
        }
    }

    public void attack(GameCharacter character) {
        if (!isAlive()) {
            System.out.println("You are dead, you can't attack.");
            return;
        }
        if (!character.isAlive()) {
            System.out.println("(S)he is already dead, stop attacking.");
            return;
        }

        int weaponDamage = 0;
        if (this.weapon != null) {
            weaponDamage = this.weapon.getDamage();
            weapon.attackEffect();
        }
        int damage = attackPower + weaponDamage;
        System.out.println(this.name + " tried to attack with " + damage + " attack power.");
        character.takeDamage(damage);
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return Math.max(health, 0);
    }

    public String getRole() {
        return this.role;
    }

    public boolean isAlive() {
        return this.health > 0;
    }
}
