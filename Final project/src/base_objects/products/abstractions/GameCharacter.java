package base_objects.products.abstractions;

import java.util.ArrayList;
import java.util.List;

import base_objects.enums.Action;
import strategy.CombatStrategy;
import bridge.Renderer;
import observer.GameListener;

public abstract class GameCharacter {
    protected String name;
    protected String role;
    protected int maxHealth;
    protected int health;
    protected int attackPower;
    protected Armor armor;
    protected Weapon weapon;
    protected boolean isDefending;

    protected CombatStrategy strategy;
    protected Renderer renderer;
    private final List<GameListener> listeners = new ArrayList<>();

    protected GameCharacter(String name, String role, int maxHealth, int attackPower) {
        this.name = name;
        this.role = role;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attackPower = attackPower;
    }

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
            notifyAtackMissed();
            return;
        }

        int actualDamage = damage - protection;
        
        if (this.isDefending) {
            actualDamage = Math.max(1, actualDamage / 2);
            this.isDefending = false;
        } 

        health = Math.max(0, health - actualDamage);

        notifyDamaged(actualDamage);
        if (!isAlive()) {
            notifyDefeated();
        } 
    }

    public void attack(GameCharacter enemy) {
        if (!isAlive()) {
            System.out.println("You are dead, you can't attack.");
            return;
        }
        if (!enemy.isAlive()) {
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
        enemy.takeDamage(damage);
    }

    public void defend() {
        this.isDefending = true;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return health;
    }

    public String getRole() {
        return this.role;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Action chooseAction(GameCharacter enemy) {
        return strategy.chooseAction(this, enemy);
    }

    public void setStrategy(CombatStrategy strategy) {
        this.strategy = strategy;
    }

    public void display() {
        renderer.renderText(name + " (" + role + ")");
        renderer.renderBar("HP", health, maxHealth);
    }

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void addListener(GameListener listener) { 
        listeners.add(listener); 
    }

    public void removeListener(GameListener listener) { 
        listeners.remove(listener); 
    }

    private void notifyDamaged(int amount) {
        for (GameListener listener : listeners) {
            listener.onDamaged(this, amount);
        }
    }

    private void notifyDefeated() {
        for (GameListener listener : listeners) {
            listener.onDefeated(this);
        }
    }

    private void notifyAtackMissed() {
        for (GameListener listener : listeners) {
            listener.onAttackMissed(this);
        }
    }
}