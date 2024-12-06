// Shape Interface with clone method
interface Shape extends Cloneable {
    Shape clone();
    void draw();
}

// Concrete class for Circle
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        try {
            return (Circle) super.clone();  // Clone the Circle object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

// Concrete class for Rectangle
class Rectangle implements Shape {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        try {
            return (Rectangle) super.clone();  // Clone the Rectangle object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width " + width + " and height " + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class A_2_que_3 {
    public static void main(String[] args) {
        // Create an initial Circle object
        Circle circle1 = new Circle(10);
        circle1.draw();  // Output: Drawing Circle with radius 10

        // Clone the Circle object and modify its properties
        Circle circle2 = (Circle) circle1.clone();
        circle2.setRadius(20);
        circle2.draw();  // Output: Drawing Circle with radius 20

        // Create an initial Rectangle object
        Rectangle rectangle1 = new Rectangle(5, 10);
        rectangle1.draw();  // Output: Drawing Rectangle with width 5 and height 10

        // Clone the Rectangle object and modify its properties
        Rectangle rectangle2 = (Rectangle) rectangle1.clone();
        rectangle2.setWidth(8);
        rectangle2.setHeight(12);
        rectangle2.draw();  // Output: Drawing Rectangle with width 8 and height 12
    }
}

