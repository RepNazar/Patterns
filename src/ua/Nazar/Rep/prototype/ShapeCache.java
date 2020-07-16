package ua.Nazar.Rep.prototype;

import ua.Nazar.Rep.prototype.shapes.Circle;
import ua.Nazar.Rep.prototype.shapes.Rectangle;
import ua.Nazar.Rep.prototype.shapes.Shape;
import ua.Nazar.Rep.prototype.shapes.Square;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap  = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
