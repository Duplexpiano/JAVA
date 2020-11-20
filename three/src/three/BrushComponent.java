package three;

import javax.swing.JComponent;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.util.*;

public class BrushComponent extends JComponent implements MouseListener, MouseMotionListener {
	// model
	private List<List<Point2D.Double>> pointList = new ArrayList<List<Point2D.Double>>();
	private List<Point2D.Double> p = new ArrayList<Point2D.Double>();
	private int selection;

	public BrushComponent() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		for (int k = 0; k < pointList.size(); k++) {
			for (int i = 1; i < pointList.get(k).size(); i++) {
				g2.drawLine((int) pointList.get(k).get(i - 1).x, (int) pointList.get(k).get(i - 1).y,
						(int) pointList.get(k).get(i).x, (int) pointList.get(k).get(i).y);
			}
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int px = e.getX(), py = e.getY();
		if(selection == 0) return;
		if(selection == 1) {
			addPoint(px, py);
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int px = e.getX(), py = e.getY();
		if(e.getButton() == MouseEvent.BUTTON1) {
			addPoint(px, py);
			selection = 1;
		}else {
			selection = 0;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		pointList.add(p);
		selection = 0;
	}

	public void addPoint(int x, int y) {
		p.add(new Point2D.Double(x, y));
	}
}
