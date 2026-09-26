package navigator.strategies;

import java.time.LocalTime;
import navigator.AlmatyStreet;

public interface Strategy {
    int calculateKmForPath(AlmatyStreet from, AlmatyStreet to);
    int calculateCostForPath(int km);
    LocalTime calculateTimeForPath(int km);
}