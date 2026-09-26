import navigator.AlmatyStreet;
import navigator.Navigator;
import navigator.PathValues;
import navigator.strategies.concrete_strategies.BusStrategy;
import navigator.strategies.concrete_strategies.CarStrategy;
import navigator.strategies.concrete_strategies.CycleStrategy;
import navigator.strategies.concrete_strategies.WalkStrategy;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.setRoute(AlmatyStreet.ABAY_AVENUE, AlmatyStreet.DOSTYK_AVENUE);
        printRoute(navigator);

        navigator.setStrategy(new CarStrategy());
        printResult("Car", navigator.getPathValues());

        navigator.setStrategy(new WalkStrategy());
        printResult("Walk", navigator.getPathValues());

        navigator.setStrategy(new CycleStrategy());
        printResult("Cycle", navigator.getPathValues());

        navigator.setStrategy(new BusStrategy());
        printResult("Bus", navigator.getPathValues());

        navigator.setRoute(AlmatyStreet.AL_FARABI_AVENUE, AlmatyStreet.KABANBAY_BATYR_STREET);
        printRoute(navigator);

        navigator.setStrategy(new CarStrategy());
        printResult("Car", navigator.getPathValues());

        navigator.setStrategy(new WalkStrategy());
        printResult("Walk", navigator.getPathValues());

        navigator.setStrategy(new CycleStrategy());
        printResult("Cycle", navigator.getPathValues());

        navigator.setStrategy(new BusStrategy());
        printResult("Bus", navigator.getPathValues());
    }

    private static void printResult(String label, PathValues result) {
        System.out.printf(
            "%-20s | %2d km | $%-3d | %s%n",
            label, result.distanceInKm(), result.costInDollars(), result.timeToArrive()
        );
    }

    private static void printRoute(Navigator navigator) {
        System.out.println("-".repeat(43));
        System.out.printf("Path from %s to %s.%n", 
            navigator.getFromStreet().getDisplayName(), navigator.getToStreet().getDisplayName()
        );
        System.out.println("-".repeat(43));
    }
}