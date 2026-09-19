package shapes;

import renderers.*;

public abstract class Shape {
    protected Renderer renderer; 
    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract double area();
    public abstract void show();

    public boolean isBiggerThan(Shape other) {
        return this.area() > other.area();
    }
}
