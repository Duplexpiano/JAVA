package first;

public abstract class Shape implements Comparable<Shape> {
	// 使用泛型Comparable接口提供一个类型参数
	public static final double PI = 3.14;

	// 求面积
	public abstract double getArea();

	// compareTo()实现
	@Override
	public int compareTo(Shape other) {
		return Double.compare(getArea(), other.getArea());
	}
}
