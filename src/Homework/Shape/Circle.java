package Homework.Shape;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculationArea();
    }

    @Override
    void calculationArea() {
        setArea(radius*radius* 3.141592653589793);
        System.out.println(getArea());
    }
}
