package fabric_method.factories.implementations;

import fabric_method.factories.TransportFactory;
import fabric_method.products.Transport;
import fabric_method.products.implementations.Truck;

public class TruckFactory extends TransportFactory {
    @Override 
    public Transport createTransport() {
        return new Truck();
    }
}
