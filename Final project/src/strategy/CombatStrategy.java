package strategy;

import java.util.Random;
import base_objects.enums.Action;
import base_objects.products.abstractions.GameCharacter;

public abstract class CombatStrategy {
    protected final Random random = new Random();
    public abstract Action chooseAction(GameCharacter self, GameCharacter enemy);
}
