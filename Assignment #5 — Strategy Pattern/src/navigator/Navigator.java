package navigator;

import java.time.LocalTime;
import navigator.strategies.Strategy;

public class Navigator {
    public Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public PathValues getPathValues(AlmatyStreet fromStreet, AlmatyStreet toStreet) {
        int distanceInKm = strategy.calculateKmForPath();
        int costInDollars = strategy.calculateCostForPath();
        LocalTime timeToArrive = strategy.calculateTimeForPath();
        return new PathValues(distanceInKm, costInDollars, timeToArrive);
    }
}
