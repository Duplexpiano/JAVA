package abstractClass;

public abstract class Shape {
	private static final double PI = 3.14;
	
	public static double getPi() {
		return PI;
	}
	//求周长
	public abstract double getPerimeter();
	//求面积
	public abstract double getArea();
}
