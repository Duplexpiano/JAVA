package abstractClass;

import java.util.ArrayList;

public class TestShape {

	public static void main(String[] args) {
		ArrayList<Shape> shape = new ArrayList<>();
		double res = 0;
//		if(Triangle.isTriangle(3, 4, 5)) {
//			Shape s1 = new Triangle(3, 4, 5);
//			shape.add(s1);
//		}
		Shape s1 = new Triangle(3, 4, 5);
		Shape s2 = new Rectangle(4, 5);
		Shape s3 = new Circle(Shape.getPi(), 4);
		shape.add(s1);
		shape.add(s2);
		shape.add(s3);
//		System.out.println(s1);
		System.out.println("triangle's perimeter: "+s1.getPerimeter()+ " triangle's area: "+s1.getArea());
		System.out.println("rectangle's perimeter: " + s2.getPerimeter() + " rectangle's area: " + s2.getArea());
		System.out.println("circle's perimeter: " + s3.getPerimeter() + "circle's area: " + s3.getArea());
		for(Shape e : shape) {
			res += e.getArea()+e.getPerimeter();
		}
		System.out.println("Result: "+res);
	}

}
