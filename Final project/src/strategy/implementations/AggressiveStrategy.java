package strategy.implementations;

import strategy.CombatStrategy;
import base_objects.enums.Action;
import base_objects.products.abstractions.GameCharacter;

public class AggressiveStrategy extends CombatStrategy {
    @Override
    public Action chooseAction(GameCharacter self, GameCharacter enemy) {
        int attackChance = 90;
        if (self.getHealth() < 15) {
            attackChance = 50;
        }

        if (random.nextInt(100) < attackChance) {
            return Action.ATTACK;
        }
        return Action.DEFEND;
    }
}
