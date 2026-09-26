package navigator;

import java.time.LocalTime;
import navigator.strategies.Strategy;

public class Navigator {
    private Strategy strategy;
    private AlmatyStreet fromStreet;
    private AlmatyStreet toStreet;

    public void setRoute(AlmatyStreet fromStreet, AlmatyStreet toStreet) {
        this.fromStreet = fromStreet;
        this.toStreet = toStreet;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public PathValues getPathValues() {
        int km = strategy.calculateKmForPath(fromStreet, toStreet);
        int cost = strategy.calculateCostForPath(km);
        LocalTime time = strategy.calculateTimeForPath(km);
        return new PathValues(km, cost, time);
    }
}