import fabric_method.factories.TransportFactory;
import fabric_method.factories.implementations.ShipFactory;
import fabric_method.factories.implementations.TruckFactory;

public class Main {
    static TransportFactory factory;

    public static void main(String[] args) {
        // Fabric method
        String[] configValues = {"Truck", "Ship"};
        for (String config: configValues) {
            createFactory(config);
            String objectId = "123";
            Double deliveryCost = factory.deliver(objectId, 5);
            System.out.println(config + "'s' delivery cost for " + objectId + " is equal to " + deliveryCost + "$");
        }

        // Abstract Fabric
        
    }

    static void createFactory(String config) {
        if (config.equals("Ship")) {
            factory = new ShipFactory();
        } else if (config.equals("Truck")) {
            factory = new TruckFactory();
        } else {
            throw new IllegalArgumentException("Uncorrect transport type");
        }
    }
}