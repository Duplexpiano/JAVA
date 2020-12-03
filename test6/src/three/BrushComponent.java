package three;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.io.PrintWriter;

import javax.swing.*;

public class BrushComponent extends JComponent implements MouseListener, MouseMotionListener {
	// model
	private List<List<Point2D.Double>> pointList = new ArrayList<List<Point2D.Double>>(); // 所有曲线集合
	private static int count; // 曲线集合下标(自增)
	private int selection; // 0: released and new ArrayList<Point2D.Double>() 1: add new point

	static {

	}

	public BrushComponent() {
		pointList.add(new ArrayList<Point2D.Double>());// first 'List<Point2D.Double>'
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	// view
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		for (int k = 0; k < pointList.size(); k++) {
			for (int i = 1; i < pointList.get(k).size(); i++) {
				g2.drawLine((int) pointList.get(k).get(i - 1).x, (int) pointList.get(k).get(i - 1).y,
						(int) pointList.get(k).get(i).x, (int) pointList.get(k).get(i).y);
			}
		}
		// 保存点集到"D:\\Program Files\\eclipse\\test6\\list.txt"
		this.saveList();
	}

	// 当按下组件上的鼠标按钮并拖动时调用。
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO: 添加鼠标（当前）坐标到（当前）count下标的曲线点集合
		int px = e.getX(), py = e.getY();
		if (selection == 0)
			return;
		if (selection == 1) {
			pointList.get(count).add(new Point2D.Double(px, py));
		}
		// 重绘
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO: 按下鼠标左键时, add point(当前点)
		int px = e.getX(), py = e.getY();
		if (e.getButton() == MouseEvent.BUTTON1) {
			selection = 1;
			pointList.get(count).add(new Point2D.Double(px, py));
		} else {
			selection = 0;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO: 鼠标松开时, count+1, 生成一个新的曲线点集
		pointList.add(new ArrayList<Point2D.Double>());
		addCount();
//		System.out.println(count);
		selection = 0;
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	static void addCount() {
		// TODO: count+1
		count++;
	}

	public void saveList() {
		try {
			PrintWriter out = new PrintWriter("D:\\Program Files\\eclipse\\test6\\list.txt");
			for (List<Point2D.Double> l : pointList) {
				for (Point2D.Double p : l) {
					out.println("<" + p.getX() + ", " + p.getY() + " >");
				}
			}
			out.flush();// 清空缓存区
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
