package navigator.strategies.concrete_strategies;

import navigator.AlmatyStreet;
import navigator.strategies.Strategy;
import java.time.LocalTime;

public class CarStrategy implements Strategy {
    private static final int DOLLARS_PER_KM = 2;
    private static final int SPEED_KM_H = 40;

    @Override
    public int calculateKmForPath(AlmatyStreet from, AlmatyStreet to) {
        return (from.getDistanceFactor() + to.getDistanceFactor()) / 10;
    }

    @Override
    public int calculateCostForPath(int km) {
        return km * DOLLARS_PER_KM;
    }

    @Override
    public LocalTime calculateTimeForPath(int km) {
        double hours = km / (double) SPEED_KM_H;
        int h = (int) hours;
        int m = (int) Math.round((hours - h) * 60);
        return LocalTime.of(h, m);
    }
}