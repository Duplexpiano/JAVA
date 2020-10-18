package abstractClass;

public class Circle extends Shape {
	private double radius;

	public Circle(double PI, double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRidius(double radius) {
		this.radius = radius;
	}

	// 圆的周长覆盖方法
	@Override
	public double getPerimeter() {
		return 2 * radius * getPi();
	}

	// 圆的面积覆盖方法
	@Override
	public double getArea() {
		return getPi() * radius * radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
