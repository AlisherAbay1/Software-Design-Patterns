package fabric_method;

import fabric_method.factories.TransportFactory;
import fabric_method.factories.implementations.ShipFactory;
import fabric_method.factories.implementations.TruckFactory;

public class FactoryMethodApplication {
    TransportFactory factory;

    public void showFabricMethodWork(String config) {
        createFactory(config);

        String objectId = "123";
        Double deliveryCost = factory.deliver(objectId, 5);
        System.out.println(String.format(
            "%s's delivery cost for %s is equal to %s$",
            config, objectId, deliveryCost
        ));
    }

    public void createFactory(String config) {
        if (config.equals("Ship")) {
            factory = new ShipFactory();
        } else if (config.equals("Truck")) {
            factory = new TruckFactory();
        } else {
            throw new IllegalArgumentException("Uncorrect transport type");
        }
    }
}
