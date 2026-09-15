package fabric_method.factories;

import fabric_method.Transport;
import fabric_method.TransportFactory;
import fabric_method.products.Truck;

public class TruckFactory extends TransportFactory {
    @Override 
    public Transport createTransport() {
        return new Truck();
    }
}
