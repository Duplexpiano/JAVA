package Shape;

public class Rectangle {
	// 长方形的长和宽
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		setLength(length);
		setWidth(width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length < 0)
			length = 0.0;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0)
			width = 0.0;
		this.width = width;
	}

	// 求长方形的周长
	public double getPerimeter() {
		return 2.0 * (length + width);
	}

	// 求长方形的面积
	public double getArea() {
		return length * width;
	}
}
