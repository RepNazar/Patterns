package ua.Nazar.Rep.prototype.shapes;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}