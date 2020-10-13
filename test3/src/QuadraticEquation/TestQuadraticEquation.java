package QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		System.out.println("Please input the value of a, b, c:");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		in.close();
		QuadraticEquation t1 = new QuadraticEquation(a, b, c);
		System.out.println("b^2-4ac = " + t1.getDiscriminant());
		if(t1.getDiscriminant() > 0) {
			System.out.println("The equation has 2 roots.: r1 = " + t1.getRoot1() + ", r2 = " + t1.getRoot2());
		}else if(t1.getDiscriminant() == 0) {
			System.out.println("The equation has 1 root.: r = " + t1.getRoot1());
		}else{
			System.out.println("The equation has no roots.");
		}
	}

}
