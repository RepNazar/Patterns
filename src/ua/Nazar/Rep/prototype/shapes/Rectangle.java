package ua.Nazar.Rep.prototype.shapes;

import ua.Nazar.Rep.prototype.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
