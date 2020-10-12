package Shape;

public class Triangle {
	//三角形的三条边
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if(a < 0)
			a = 0.0;
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		if(b < 0)
			b = 0.0;
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		if(c < 0)
			c = 0.0;
		this.c = c;
	}
	
	public boolean isTriangle(double a, double b, double c) {
		if (a + b > c || a + c > c || b + c > a) {
			return true;
		} else
			return false;
	}
	//求三角形的周长
	public double getPerimeter() {
		return a + b + c;
	}
	//求三角形的面积
	public double getArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
