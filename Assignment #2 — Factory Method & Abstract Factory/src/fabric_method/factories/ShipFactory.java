package fabric_method.factories;

import fabric_method.*;
import fabric_method.products.*;

public class ShipFactory extends TransportFactory {
    @Override 
    public Transport createTransport() {
        return new Ship();
    }
}
