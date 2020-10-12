package Shape;

public class Circle {
	//圆的半径
	private double radius;
	// final定义常量,全局只有一份，不用new即可使用
	public static final double PI = 3.14;

	static {
		// 初始化块
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius < 0)
			radius = 0.0;  //数据校验
		this.radius = radius;
	}
	//求圆的周长
	public double getPerimeter() {
		return 2.0 * PI * radius;
	}
	//求圆的面积
	public double getArea() {
		return PI * radius * radius;
	}

}
