package navigator.strategies.concrete_strategies;

import java.time.LocalTime;
import navigator.AlmatyStreet;
import navigator.strategies.Strategy;

public class WalkStrategy implements Strategy {
    private static final int DOLLARS_PER_KM = 0;
    private static final int SPEED_KM_H = 4;

    @Override
    public int calculateKmForPath(AlmatyStreet fromStreet, AlmatyStreet toStreet) {
        return (fromStreet.getDistanceFactor() + toStreet.getDistanceFactor()) / 2;
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