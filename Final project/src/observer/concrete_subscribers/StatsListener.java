package observer.concrete_subscribers;

import observer.GameListener;
import base_objects.products.abstractions.GameCharacter;

public class StatsListener implements GameListener {
    private int totalDamage = 0;
    private int defeated = 0;
    private int missed = 0;
    private int defended = 0;

    @Override
    public void onDamaged(GameCharacter target, int amount) { 
        totalDamage += amount; 
    }
    
    @Override
    public void onDefeated(GameCharacter target) {
        defeated++; 
    }

    @Override
    public void onAttackMissed(GameCharacter target) {
        missed++;
    }
    
    @Override
    public void onDefended(GameCharacter target) {
        defended++;
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

    public int getDefended() {
        return defended;
    }
}