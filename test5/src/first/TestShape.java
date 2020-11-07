package first;

import java.util.Arrays;

public class TestShape {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		shapes[0] = new Circle(50);
		shapes[1] = new Rectangle(4, 8);
		shapes[2] = new Triangle(6, 9, 11);
		shapes[3] = new Circle(52);
		shapes[4] = new Rectangle(8, 40);
		shapes[5] = new Triangle(12, 16, 20);
		Arrays.sort(shapes);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("shapes[" + i + "] = " + shapes[i].getArea());
		}
	}

}
