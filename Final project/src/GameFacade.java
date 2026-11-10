import abstract_factory.CharacterFactory;
import abstract_factory.implementations.ArcherFactory;
import abstract_factory.implementations.MageFactory;
import abstract_factory.implementations.WarriorFactory;
import base_objects.enums.Action;
import base_objects.products.abstractions.GameCharacter;
import bridge.Renderer;
import bridge.concrete_implementations.AsciiRenderer;
import bridge.concrete_implementations.ConsoleRenderer;
import builders.CharacterDirector;
import builders.concrete_builders.CharacterObjectBuilder;
import observer.concrete_subscribers.ConsoleLogListener;
import observer.concrete_subscribers.StatsListener;
import strategy.CombatStrategy;
import strategy.implementations.AggressiveStrategy;
import strategy.implementations.BalancedStrategy;
import strategy.implementations.DefensiveStrategy;

public class GameFacade {
    private final CharacterDirector director = new CharacterDirector();
    private final ConsoleLogListener logger = new ConsoleLogListener();
    private final StatsListener stats = new StatsListener();

    public GameCharacter createCharacter(String type, String name, String strategy, String renderer) {
        CharacterObjectBuilder builder = new CharacterObjectBuilder(selectFactory(type));
        director.constructFull(builder, name);
        GameCharacter character = builder.getResult();

        character.setStrategy(selectStrategy(strategy));
        character.setRenderer(selectRenderer(renderer));
        character.addListener(logger);
        character.addListener(stats);
        return character;
    }

    public void fight(GameCharacter a, GameCharacter b) {
        int round = 1;
        while (a.isAlive() && b.isAlive()) {
            System.out.println("--- Round " + round++ + " ---");
            takeTurn(a, b);
            if (b.isAlive()) {
                takeTurn(b, a);
            }
        }
    }

    public void printStats() {
        System.out.println("Total damage: " + stats.getTotalDamage());
        System.out.println("Defeated: " + stats.getDefeated());
        System.out.println("Missed: " + stats.getMissed());
        System.out.println("Defended: " + stats.getDefended());
    }

    private void takeTurn(GameCharacter self, GameCharacter enemy) {
        if (self.chooseAction(enemy) == Action.ATTACK) {
            self.attack(enemy);
        } else {
            self.defend();
        }
    }

    private CharacterFactory selectFactory(String type) {
        switch (type.toLowerCase()) {
            case "warrior": return new WarriorFactory();
            case "mage": return new MageFactory();
            case "archer": return new ArcherFactory();
            default: throw new IllegalArgumentException("Unknown character type: " + type);
        }
    }

    private CombatStrategy selectStrategy(String strategy) {
        switch (strategy.toLowerCase()) {
            case "aggressive": return new AggressiveStrategy();
            case "balanced": return new BalancedStrategy();
            case "defensive": return new DefensiveStrategy();
            default: throw new IllegalArgumentException("Unknown strategy: " + strategy);
        }
    }

    private Renderer selectRenderer(String renderer) {
        switch (renderer.toLowerCase()) {
            case "console": return new ConsoleRenderer();
            case "ascii": return new AsciiRenderer();
            default: throw new IllegalArgumentException("Unknown renderer: " + renderer);
        }
    }
}