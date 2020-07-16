package ua.Nazar.Rep.abstractFactory;

import ua.Nazar.Rep.abstractFactory.shapes.RoundedRectangle;
import ua.Nazar.Rep.abstractFactory.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        }
        return null;
    }
}
