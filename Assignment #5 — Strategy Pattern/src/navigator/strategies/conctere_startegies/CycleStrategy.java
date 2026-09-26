package navigator.strategies.conctere_startegies;

import navigator.AlmatyStreet;
import navigator.strategies.Strategy;
import java.time.LocalTime;

public class CycleStrategy extends Strategy {
    private final static int DOLLARS_PER_KM = 0;
    CycleStrategy(AlmatyStreet fromStreet, AlmatyStreet toStreet) {
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
        int HOURS = calculateKmForPath() / 10;
        int MINUTS = (calculateKmForPath() / 10 - HOURS) * 60;
        return LocalTime.of(HOURS, MINUTS);
    }
}
