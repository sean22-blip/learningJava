package Polymorphism;

public class Circle extends Shape{

private double r;

    public Circle(double r) {
        super();
        this.r = r;
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
        System.out.println("Draw circle!");
    }
    public void draw(double radius){
        System.out.println("Draw circle with radius : " + radius);
    }

}
