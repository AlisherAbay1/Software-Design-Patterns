package fabric_method.factories;

import fabric_method.products.Transport;

public abstract class TransportFactory {
    public double deliver(String objectId, double distanceKm) {
        Transport transport = createTransport();

        transport.loading(objectId);
        transport.move();
        double cost = transport.calculateDeliveryCost(distanceKm);
        transport.unloading(objectId);

        return cost;
    }
    
    public abstract Transport createTransport();
}
