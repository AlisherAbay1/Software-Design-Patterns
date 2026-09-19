package shapes.concrete_shapes;

import shapes.Shape;
import renderers.*;

public class Circle extends Shape {
    double radius;
    public Circle(Renderer renderer, double radius) {
        super(renderer);
        this.radius = radius;
    } 

    @Override 
    public void show() {
        this.renderer.showCircle(radius);
    }

    @Override 
    public double area() {
        return 3.14 * this.radius * this.radius;
    }
}
