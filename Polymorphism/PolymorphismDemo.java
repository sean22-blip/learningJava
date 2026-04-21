package Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5),
                new Rectangle(4, 5),
                new Circle(4),
                new Triangle(3,4,5),
                new Rectangle(2,4)
    };

       for(Shape shape : shapes){
           shape.display();
       }
       double totalArea = 0;
       for(Shape shape : shapes){
           totalArea += shape.getArea();
       }
        System.out.println(totalArea);

    }
    void test() {
//        Shape shape = new Shape();
//        shape.draw();
//        Shape shape = new Circle();
//        shape.draw();
        // Shape shape = new Rectangle();
//        shape.draw();
//        Shape shape = new Shape();
////        shape.draw();
//        Circle circle = new Circle();
//        circle.draw();
//
//        circle.draw(4);
    }
}
