package Polymorphism;

public class Rectangle extends Shape {

    private  double width;
    private  double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    String getType() {
        return "";
    }
    @Override
    public void draw(){
        System.out.println("Draw Rectangle!");
    }
}
