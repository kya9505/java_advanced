package Homework.Shape;

public class Rectangular extends Shape {
    double width;
    double hight;

    public Rectangular(double width, double hight) {
        this.width = width;
        this.hight = hight;
        calculationArea();
    }

    @Override
    void calculationArea() {
        setArea(hight * width );
        System.out.println(getArea());

    }
}
