package ua.Nazar.Rep.prototype.shapes;

import ua.Nazar.Rep.prototype.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}