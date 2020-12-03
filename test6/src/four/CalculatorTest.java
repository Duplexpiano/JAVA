package four;

import java.awt.EventQueue;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new CalcuJFrame();
			}
		});
	}

}
