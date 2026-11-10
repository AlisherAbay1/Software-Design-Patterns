package observer.concrete_subscribers;

import observer.GameListener;
import base_objects.products.abstractions.GameCharacter;

public class ConsoleLogListener implements GameListener {
    public void onDamaged(GameCharacter target, int amount) {
        System.out.println(target.getName() + " took " + amount + " damage, HP: " + target.getHealth());
    }
    
    public void onDefeated(GameCharacter target) {
        System.out.println(target.getName() + " has died");
    }

    public void onAttackMissed(GameCharacter target) {
        System.out.println("Attack on " + target.getName() + " missed");
    }
}