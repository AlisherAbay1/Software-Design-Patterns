package factory_method.factories.implementations;

import factory_method.factories.TransportFactory;
import factory_method.products.Transport;
import factory_method.products.implementations.Truck;

public class TruckFactory extends TransportFactory {
    @Override 
    public Transport createTransport() {
        return new Truck();
    }
}
