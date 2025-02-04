package day1.Homework.Shape;

import java.util.ArrayList;

public class TestShape {
	public static void main(String[] args) {
		Shape [] shapes = new Shape[2];
		shapes[0] = new Circle(10,"원");
		shapes[1] = new Rectangular(10,20,"직사각형");
		ArrayList<Shape> shapes1 = new ArrayList<>();
		shapes1.add(new Circle(10,"원"));
		shapes1.add(new Circle(20,"원"));
		shapes1.add(new Rectangular(10,20,"직사각형"));

		for (Shape shape : shapes1){
			if(shape instanceof Circle){
				System.out.printf("%s의 면적은 %f%n",shape.getName(),shape.area);
			} else if (shape instanceof Rectangular) {
				System.out.printf("%s의 면적은 %.1f%n",shape.getName(),shape.area);
			}
		}

		for(int i =0; i<shapes.length; i++){
			shapes[i].print();
		}
	}
}