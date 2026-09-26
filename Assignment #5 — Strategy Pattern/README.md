# Assignment #5 — Strategy

Route planning demo: a client asks a navigator for the distance, cost, and time of a route, and the calculation depends on which transport method is currently plugged in, swappable at runtime without touching the navigator itself.

## Strategy

`Strategy` is the interface, declaring three methods: `calculateKmForPath()`, `calculateCostForPath()`, `calculateTimeForPath()` that every transport method implements independently. `CarStrategy`, `WalkStrategy`, `CycleStrategy`, and `BusStrategy` are the Concrete Strategies, each holding its own speed and price and computing the three values from that alone. `Navigator` is the Context: it holds the current route `fromStreet`, `toStreet` and the currently set `Strategy`, and delegates all three calculations to it through `getPathValues()`. `AlmatyStreet` is an enum carrying a display name and a distance factor per street, and `PathValues` is a plain record holding the result of a calculation.

`Navigator` never checks which concrete strategy is set, `setStrategy()` just replaces the reference, and the client `Main` is the one choosing and instantiating the concrete class, as demonstrated by running all four strategies over two different routes.