package observer.concrete_subscribers;

import observer.GameListener;
import base_objects.products.abstractions.GameCharacter;

public class StatsListener implements GameListener {
    private int totalDamage = 0;
    private int defeated = 0;
    private int missed = 0;

    public void onDamaged(GameCharacter target, int amount) { 
        totalDamage += amount; 
    }
    
    public void onDefeated(GameCharacter target) {
        defeated++; 
    }

    public void onAttackMissed(GameCharacter target) {
        missed++;
    }
    
    public int getTotalDamage() { 
        return totalDamage; 
    }

    public int getDefeated() { 
        return defeated; 
    }

    public int getMissed() {
        return missed;
    }
}