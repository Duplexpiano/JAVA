package Shape;

public class TestShape {

	public static void main(String[] args) {
		double length = 1+Math.random()*10;
		double width = 1+Math.random()*10;
		double radius = 100.0*Math.random();
		Rectangle perRectangle = new Rectangle(length, width);
		Rectangle areaRectangle = new Rectangle(length, width);
		Triangle perTriangle = new Triangle(3, 4, 5);
		Triangle areaTriangle = new Triangle(3, 4, 5); 
		Circle perCircle = new Circle(radius);
		Circle areaCircle = new Circle(radius);
//		System.out.println(rectangle.getPerimeter() + rectangle.getArea() + triangle.getPerimeter() + triangle.getArea() + circle.getPerimeter() + circle.getArea());
		double result = perCircle.getPerimeter() + perRectangle.getPerimeter() + perTriangle.getPerimeter() + areaCircle.getArea() + areaRectangle.getArea() + areaTriangle.getArea();
		System.out.println("perC:"+perCircle.getPerimeter());
		System.out.println("areaC:"+areaCircle.getArea());
		System.out.println("perR:"+perRectangle.getPerimeter());
		System.out.println("areaR:"+areaRectangle.getArea());
		System.out.println("perT:"+perTriangle.getPerimeter());
		System.out.println("areaT:"+areaTriangle.getArea());
		System.out.printf("result = %f", result);
	}

}
