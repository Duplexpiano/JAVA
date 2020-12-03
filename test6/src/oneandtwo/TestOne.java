package oneandtwo;

import java.awt.EventQueue;

public class TestOne {
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			new ThisJFrame();
		});
	}
}
