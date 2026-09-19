import renderers.concrete_renderers.*;
import shapes.concrete_shapes.*;

public class Main {
    public static void main(String[] args) {
        RasterRenderer rasterRenderer = new RasterRenderer();
        VectorRenderer vectorRenderer = new VectorRenderer();

        Circle rasterCircle = new Circle(rasterRenderer, 2);
        Circle vectorCircle = new Circle(vectorRenderer, 4);
        Square rasterSquare = new Square(rasterRenderer, 5);
        Square vectorSquare = new Square(vectorRenderer, 3);

        printArticle("AREAS OF THE SHAPES");

        System.out.println("Area of the raster circle with radius=2. Area=" + rasterCircle.area());
        System.out.println("Area of the raster circle with radius=4. Area=" + vectorCircle.area());
        System.out.println("Area of the raster circle with side=5. Area=" + rasterSquare.area());
        System.out.println("Area of the raster circle with side=3. Area=" + vectorSquare.area());

        printArticle("SHOW SHAPES");

        rasterCircle.show();
        vectorCircle.show();
        rasterSquare.show();
        vectorCircle.show();

        printArticle("COMPAIR SHAPES");

        System.out.println(
            "raster circle with radius=" + 2 + 
            "is bigger than " +
            "raster square with side=" + 5 + 
            ". Result: " + rasterCircle.isBiggerThan(rasterSquare));
        System.out.println(
            "vector circle with radius=" + 2 + 
            "is bigger than " +
            "vector square with side=" + 5 + 
            ". Result: " + vectorCircle.isBiggerThan(vectorSquare));
        System.out.println(
            "raster square with side=" + 2 + 
            "is bigger than " +
            "vector circle with radius=" + 5 + 
            ". Result: " + rasterSquare.isBiggerThan(vectorCircle));
        System.out.println(
            "vector square with side=" + 2 + 
            "is bigger than " +
            "raster circle with radius=" + 5 + 
            ". Result: " + vectorSquare.isBiggerThan(rasterCircle));
    }

    protected static void printArticle(String articleText) {
        System.out.println("=".repeat(40));
        System.out.println(articleText);
        System.out.println("=".repeat(40));
    }
}
