import abstract_factory.implementations.ArcherFactory;
import base_objects.enums.Action;
import base_objects.products.abstractions.GameCharacter;
import bridge.concrete_implementations.AsciiRenderer;
import builders.CharacterDirector;
import builders.concrete_builders.CharacterJsonBuilder;
import observer.concrete_subscribers.StatsListener;
import strategy.implementations.AggressiveStrategy;
import strategy.implementations.BalancedStrategy;
import strategy.implementations.DefensiveStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("##### Abstract Factory and Builder #####");
        CharacterDirector director = new CharacterDirector();
        CharacterJsonBuilder jsonBuilder = new CharacterJsonBuilder(new ArcherFactory());
        director.constructNoArmor(jsonBuilder, "Robin");
        System.out.println(jsonBuilder.getResult());

        System.out.println("\n##### Facade #####");
        GameFacade game = new GameFacade();
        GameCharacter hero = game.createCharacter("warrior", "Hero", "balanced", "console");
        GameCharacter enemy = game.createCharacter("mage", "Enemy", "aggressive", "ascii");

        // Observer
        StatsListener heroStats = new StatsListener();
        hero.addListener(heroStats);

        System.out.println("\n##### Bridge #####");
        hero.display();
        hero.setRenderer(new AsciiRenderer());
        hero.display();
        enemy.display();

        System.out.println("\n##### Strategy #####");
        hero.setStrategy(new AggressiveStrategy());
        System.out.println("Aggressive: " + countAttacks(hero, enemy) + "/100 attacks");
        hero.setStrategy(new BalancedStrategy());
        System.out.println("Balanced: " + countAttacks(hero, enemy) + "/100 attacks");
        hero.setStrategy(new DefensiveStrategy());
        System.out.println("Defensive: " + countAttacks(hero, enemy) + "/100 attacks");
        hero.setStrategy(new BalancedStrategy());

        System.out.println("\n##### Fight #####");
        game.fight(hero, enemy);

        System.out.println("\n##### Results #####");
        hero.display();
        enemy.display();
        game.printStats();
        System.out.println("Damage taken by hero only: " + heroStats.getTotalDamage());
    }

    private static int countAttacks(GameCharacter self, GameCharacter enemy) {
        int attacks = 0;
        for (int i = 0; i < 100; i++) {
            if (self.chooseAction(enemy) == Action.ATTACK) {
                attacks++;
            }
        }
        return attacks;
    }
}