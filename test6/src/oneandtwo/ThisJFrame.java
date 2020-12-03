package oneandtwo;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.geom.Point2D;

import javax.swing.JFrame;

public class ThisJFrame extends JFrame {
	private double[] x, y;

	public void setX(double[] x) {
		this.x = x;
	}

	public void setY(double[] y) {
		this.y = y;
	}

	/*
	 * default:默认 dimension:维度 Toolkit:工具箱
	 */
	public ThisJFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();// 返回默认的工具箱
		Dimension screenSize = kit.getScreenSize();// 设置"维度"对象
		int screenWidth = screenSize.width;// 本地屏幕宽度
		int screenHeight = screenSize.height;// 本地屏幕高度
		this.setVisible(true);// 设置visible属性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 程序退出语句
		this.setSize(screenWidth / 2, screenHeight / 2); // 设置框架尺寸
		this.setTitle("DrawLine"); // 设置标题
		this.setLocationRelativeTo(null);// 居中
		this.add(new DrawLineComponent(setPoints1(), setPoints2(), setPoints3()));
//		this.printPoints(this.setPoints2());
	}

	public Point2D.Double[] setPoints1() {
		// TODO: 生成曲线点集
		Point2D.Double[] points = new Point2D.Double[12];
		int flag = -1;
		for (int i = 0; i < 12; i++) {
			if (i % 2 != 0) { // i为奇数时，points[i].y = points[0]-5*i;
				flag = -1;
				points[i] = new Point2D.Double(getSize().width / 2 + i * 20, getSize().height / 2 + flag * 5 * i);
			} else { // i为偶数时，points[i].y = points[0]+5*i
				flag = 1;
				points[i] = new Point2D.Double(250 + i * 20, 250 + flag * 5 * i);// 起始点(250, 250)
			}
		}
		return points;
	}

	public Point2D.Double[] setPoints2() {
		// TODO: 生成正弦曲线点集
		Point2D.Double[] points2 = new Point2D.Double[360];
		for (int i = 0; i < points2.length; i++) {
			double x = Math.toRadians(-180 + 5 * i); // -180°开始，每次增加1°
//			System.out.println(x);
			points2[i] = new Point2D.Double(x * 100 + getSize().width / 2, Math.sin(x) * 150 + getSize().height / 2);
		}
		return points2;
	}

	public Point2D.Double[] setPoints3() {
		// TODO: 生成余弦曲线点集
		Point2D.Double[] points2 = new Point2D.Double[360];
		for (int i = 0; i < points2.length; i++) {
			double x = Math.toRadians(-180 + i); // -180°开始，每次增加1°
//			System.out.println(x);
			points2[i] = new Point2D.Double(x * 100 + getSize().width / 2, Math.cos(x) * 150 + getSize().height / 2);
		}
		return points2;
	}

	private void printPoints(Point2D.Double[] points) {
		for (Point2D p : points) {
			System.out.println("<" + p.getX() + ", " + p.getY() + ">");
		}
	}
}
