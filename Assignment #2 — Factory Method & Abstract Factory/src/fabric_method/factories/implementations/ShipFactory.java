package fabric_method.factories.implementations;

import fabric_method.factories.TransportFactory;
import fabric_method.products.*;
import fabric_method.products.implementations.Ship;

public class ShipFactory extends TransportFactory {
    @Override 
    public Transport createTransport() {
        return new Ship();
    }
}
