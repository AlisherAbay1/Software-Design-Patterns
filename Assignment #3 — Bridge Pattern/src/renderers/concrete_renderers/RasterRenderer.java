package renderers.concrete_renderers;

import renderers.*;

public class RasterRenderer implements Renderer {
    public void showCircle(double radius) {
        System.out.println("Raster renderer showed raster cirle with radius: " + radius);
    }
    public void showSquare(double side) {
        System.out.println("Raster renderer showed raster square with side: " + side);
    }
}
