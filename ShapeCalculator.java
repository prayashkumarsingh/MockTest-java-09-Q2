abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    
    @Override
    double calculateArea() {
        return (base * height) / 2;
    }
}

public class ShapeCalculator {
    public static void printArea(Shape shape) {
        System.out.println("The area of the shape is " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 5);

        ShapeCalculator.printArea(rectangle);
        ShapeCalculator.printArea(circle);
        ShapeCalculator.printArea(triangle);
    }
}
