package day1.inh;

import java.util.ArrayList;

public class ShapeMain{
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());
        shapes.add(new Triangle());
        shapes.add(new Circle());

        shapes.forEach(System.out::println);

    }
}
