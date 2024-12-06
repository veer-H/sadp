// Shape interface with a method to calculate area
interface Shape {
    double calculateArea();
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// ShapeCalculator class (no need to modify it)
class ShapeCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class  A_3_que_2{
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(4, 6);

        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Triangle area: " + calculator.calculateArea(triangle));
    }
}

