package fabric_method.products;

import fabric_method.Transport;

public class Ship extends Transport {
    public Ship() {
        this.costPerKm = 45.0;
    }

    @Override 
    public void move() {
        System.out.println("Ship is moving");
    }
}
