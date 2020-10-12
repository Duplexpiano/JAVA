package test1;

import java.util.Scanner;

public class prime {
	public static void printPrimeNumbers(int[] n) {
		int cnt = 0, rowlength = 10;
		System.out.print("The prime numbers are ");
		for (int i = 0; i < n.length; i++) {
			if (i == n.length - 1) {
				System.out.print(n[i]);
				break;
			}
			if (cnt == rowlength && cnt != 0) {
				System.out.println();
			}
			System.out.print(n[i] + ", ");
			cnt++;
		}
	}

	public static int[] getPrimeNumbers(int n) {

		int[] result = new int[n];
		int cnt = 0;
		result[0] = 1;
		result[1] = 1;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (result[i] == 0) {
				for (int j = i * i; j < n; j += i) {
					result[j] = 1;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0)
				cnt++;
		}
		int[] tmp = new int[cnt];
		for (int i = 0, j = 0; i < result.length && j < cnt; i++) {
			if (result[i] == 0) {
				tmp[j] = i;
				j++;
			}
		}
		result = tmp;
		return result;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("n = ");
		int n = in.nextInt();
		printPrimeNumbers(getPrimeNumbers(n));
		in.close();
	}

}