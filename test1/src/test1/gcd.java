package test1;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input 2 integers:");
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.println("Gcd:" + Gcd(m, n) + "\ngcd_rexursive:" + gcd_recursive(m, n));
		in.close();
	}

	private static int Gcd(int m, int n) {
		int d = m % n;
		while (d != 0) {
			m = n;
			n = d;
			d = m % n;
		}
		return n;
	}

	private static int gcd_recursive(int m, int n) {
		if (m % n != 0) {
			return gcd_recursive(n, m % n);
		}
		return n;
	}
}
