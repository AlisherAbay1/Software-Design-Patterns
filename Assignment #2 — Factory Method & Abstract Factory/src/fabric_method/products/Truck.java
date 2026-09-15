package fabric_method.products;

import fabric_method.Transport;

public class Truck extends Transport {
    public Truck() {
        this.costPerKm = 15.0;
    }

    @Override 
    public void move() {
        System.out.println("Truck is moving");
    }
}
