package Polymorphism;

public abstract class Shape {
    abstract double getArea();

    abstract String getType();

    public void display(){
        System.out.println(getType() + " , " + getArea());
    }

    public void draw() {
        System.out.println("Draw shape!");
    }
}
