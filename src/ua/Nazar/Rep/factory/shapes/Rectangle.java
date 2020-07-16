package ua.Nazar.Rep.factory.shapes;

import ua.Nazar.Rep.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
