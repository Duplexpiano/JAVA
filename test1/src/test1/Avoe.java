package test1;

import java.util.Scanner;

public class Avoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.printf("n = ");
		int n = in.nextInt();
		double apv = 1, tmp = 1;
		for (int i = 1; i < n; i++) {
			tmp *= i;
			apv += 1.0 / tmp;
		}
		System.out.printf("e = %.6f\n", apv);
		in.close();
	}

}
