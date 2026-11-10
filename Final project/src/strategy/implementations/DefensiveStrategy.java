package strategy.implementations;

import strategy.CombatStrategy;
import base_objects.enums.Action;
import base_objects.products.abstractions.GameCharacter;


public class DefensiveStrategy extends CombatStrategy {
    @Override
    public Action chooseAction(GameCharacter self, GameCharacter enemy) {
        if (enemy.getHealth() < 15) {
            return Action.ATTACK;
        }

        if (random.nextInt(100) < 30) {
            return Action.ATTACK;
        }
        return Action.DEFEND;
    }
}
