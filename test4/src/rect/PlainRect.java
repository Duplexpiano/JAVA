package rect;

public class PlainRect extends Rect {
	private double startX;
	private double startY;

	public PlainRect() {
		super();
		startX = startY = 0;
		super.height = super.width = 0;
	}

	public PlainRect(double width, double height, double startX, double startY) {
		super(width, height);
		this.startX = startX;
		this.startY = startY;
	}

	public double getStartX() {
		return startX;
	}

	public void setStartX(double startX) {
		this.startX = startX;
	}

	public double getStartY() {
		return startY;
	}

	public void setStartY(double startY) {
		this.startY = startY;
	}

	// 判断某个点(x,y)是否在矩形内部
	public boolean isInside(double x, double y) {
		if (x > super.getWidth() || x < 0 || y > super.getHeight() || y < 0) {
//			System.out.println("is outside");
			return false;
		} else {
//			System.out.println("is inside.");
			return true;
		}
	}

	@Override
	public String toString() {
		return "PlainRect [startX=" + startX + ", startY=" + startY + ", width=" + width + ", height=" + height
				+ ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}

}
