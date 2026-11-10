package observer;

import base_objects.products.abstractions.GameCharacter;

public interface GameListener {
    void onDamaged(GameCharacter target, int amount);
    void onDefeated(GameCharacter target);
    void onAttackMissed(GameCharacter target);
    void onDefended(GameCharacter target);
}