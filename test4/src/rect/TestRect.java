package rect;

public class TestRect {

	public static void main(String[] args) {
		Rect r1 = new Rect(4, 6); // 带参对象
		Rect r2 = new Rect(); // 无参对象
		PlainRect p1 = new PlainRect(8, 4, 3, 3); // 带参对象
		PlainRect p2 = new PlainRect(); // 无参对线
		System.out.println(r1 + "\n" + r2);
		System.out.println(p1 + "\n" + p2);
		System.out.println("x = 5, y = 3: " + p1.isInside(5, 3));
		System.out.println("x = 0, y = -1: " + p1.isInside(0, -1));
	}

}
