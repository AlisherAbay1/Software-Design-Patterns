package navigator.strategies;

import java.time.LocalTime;
import navigator.AlmatyStreet;

public abstract class Strategy {
    public AlmatyStreet fromStreet;
    public AlmatyStreet toStreet;

    protected Strategy(AlmatyStreet fromStreet, AlmatyStreet toStreet) {
        this.fromStreet = fromStreet;
        this.toStreet = toStreet;
    }

    public abstract int calculateKmForPath();
    public abstract int calculateCostForPath();
    public abstract LocalTime calculateTimeForPath();
}
