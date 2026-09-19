package renderers.concrete_renderers;

import renderers.*;

public class VectorRenderer implements Renderer {
    public void showCircle(double radius) {
        System.out.println("Vector renderer showed vector cirle with radius: " + radius);
    }
    public void showSquare(double side) {
        System.out.println("Vector renderer showed vector square with side: " + side);
    }
}
