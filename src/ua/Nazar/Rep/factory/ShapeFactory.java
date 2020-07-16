package ua.Nazar.Rep.factory;

import ua.Nazar.Rep.factory.shapes.Circle;
import ua.Nazar.Rep.factory.shapes.Rectangle;
import ua.Nazar.Rep.factory.shapes.Shape;
import ua.Nazar.Rep.factory.shapes.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
