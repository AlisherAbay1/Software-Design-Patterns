package factory_method.factories.implementations;

import factory_method.factories.TransportFactory;
import factory_method.products.*;
import factory_method.products.implementations.Ship;

public class ShipFactory extends TransportFactory {
    @Override 
    public Transport createTransport() {
        return new Ship();
    }
}
