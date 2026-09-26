package navigator.strategies.conctere_startegies;

import navigator.AlmatyStreet;
import navigator.strategies.Strategy;
import java.time.LocalTime;

public class CarStrategy extends Strategy {
    private final static int DOLLARS_PER_KM = 2;
    CarStrategy(AlmatyStreet fromStreet, AlmatyStreet toStreet) {
        super(fromStreet, toStreet);
    }

    @Override 
    public int calculateKmForPath() {
        return (fromStreet.getDistanceFactor() + toStreet.getDistanceFactor()) / 10;
    }

    @Override 
    public int calculateCostForPath() {
        return calculateKmForPath() * DOLLARS_PER_KM;
    }

    @Override 
    public LocalTime calculateTimeForPath() {
        int HOURS = calculateKmForPath() / 40;
        int MINUTS = (calculateKmForPath() / 40 - HOURS) * 60;
        return LocalTime.of(HOURS, MINUTS);
    }
}
