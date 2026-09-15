package factory_method.products.implementations;

import factory_method.products.Transport;

public class Ship extends Transport {
    public Ship() {
        this.costPerKm = 45.0;
    }

    @Override 
    public void move() {
        System.out.println("Ship is moving");
    }
}
