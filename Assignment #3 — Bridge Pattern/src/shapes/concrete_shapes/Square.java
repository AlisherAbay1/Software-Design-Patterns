package shapes.concrete_shapes;

import shapes.Shape;
import renderers.*;

public class Square extends Shape{
    double side;
    public Square(Renderer renderer, double side) {
        super(renderer);
        this.side = side;
    } 

    @Override 
    public void show() {
        this.renderer.showSquare(side);
    }

    @Override 
    public double area() {
        return this.side * this.side;
    }
}
