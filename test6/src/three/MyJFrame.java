package three;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {

	public MyJFrame() {
		this.setVisible(true);
		this.setSize(1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Draw Something..");
		this.add(new BrushComponent());
	}
}
