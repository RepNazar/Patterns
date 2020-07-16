package ua.Nazar.Rep.prototype.shapes;

import ua.Nazar.Rep.prototype.Shape;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
