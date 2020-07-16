package ua.Nazar.Rep.prototype.shapes;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
