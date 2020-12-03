package one;

import java.util.*;

public class ExceptionTest {

	public static void main(String[] args) {
		double[] x = new double[3];
		double sum = 0.0;
		int flag; // 1: 存在异常，并重新输入 0: 不存在异常

		Scanner inputScan = new Scanner(System.in);

		for (int i = 0; i < x.length; i++) {
			flag = 1;

			do {
				System.out.println("Please input the " + (i + 1) + " number:");
				String input = inputScan.nextLine();
				try {
					x[i] = Double.parseDouble(input);
					flag = 0;
//					System.out.println("flag = " + flag);
				} catch (NumberFormatException nfe) {
					continue;
				}
			} while (flag == 1);

//			System.out.println("flag = " + flag);
			sum += x[i];
		}
		inputScan.close();

		System.out.println(Arrays.toString(x));
		System.out.println("Sum:" + sum);
	}

}
