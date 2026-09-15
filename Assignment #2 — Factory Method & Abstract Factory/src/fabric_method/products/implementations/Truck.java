package fabric_method.products.implementations;

import fabric_method.products.Transport;

public class Truck extends Transport {
    public Truck() {
        this.costPerKm = 15.0;
    }

    @Override 
    public void move() {
        System.out.println("Truck is moving");
    }
}
