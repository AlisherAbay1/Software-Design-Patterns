package navigator;

import java.time.LocalTime;

public record PathValues(int distanceInKm, int costInDollars, LocalTime timeToArrive) {}