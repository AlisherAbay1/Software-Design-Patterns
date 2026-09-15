package fabric_method;


import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    public List<String> objectIds = new ArrayList<>();
    protected double costPerKm;

    public void loading(String objectId) {
        objectIds.add(objectId);
    }

    public void unloading(String objectId) {
        objectIds.remove(objectId);
    }

    public List<String> getObjects() {
        return objectIds;
    }

    public double calculateDeliveryCost(double distanceKm) {
        return distanceKm * costPerKm;
    }

    public abstract void move();
}
