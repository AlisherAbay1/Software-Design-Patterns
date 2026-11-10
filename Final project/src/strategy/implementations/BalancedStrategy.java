package strategy.implementations;

import strategy.CombatStrategy;
import base_objects.enums.Action;
import base_objects.products.abstractions.GameCharacter;

public class BalancedStrategy extends CombatStrategy {
    @Override
    public Action chooseAction(GameCharacter self, GameCharacter enemy) {
        if (random.nextInt(100) < 50) {
            return Action.ATTACK;
        }
        return Action.DEFEND;
    }
}
