package ua.Nazar.Rep.abstractFactory.shapes;

import ua.Nazar.Rep.abstractFactory.Shape;

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("RoundedRectangle::draw()");
    }
}
