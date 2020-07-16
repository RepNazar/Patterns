package ua.Nazar.Rep.abstractFactory;

import ua.Nazar.Rep.abstractFactory.shapes.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}
