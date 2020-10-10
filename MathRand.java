package CountAlp;

import java.util.Scanner;

public class MathRand {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		countNum(n);
		countAlp(n);
		in.close();
	}

	public static void countAlp(int n) {
		double[] cnt = new double[26];
		int pcnt = 0, rowlength = 7;
		char[] alp = new char[n];
		for (int i = 0; i < alp.length; i++) {
			alp[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
		}
		for (char x : alp) {
			for (int i = 0; i < cnt.length; i++) {
				if (x == 'a' + i)
					cnt[i]++;
			}
		}
		for (int i = 0, j = 97; i < cnt.length && j <= 122; i++, j++) {
			if (cnt[i] != 0) {
				double rlt = cnt[i] / alp.length * 100;
				if (pcnt % rowlength == 0 && pcnt != 0) {
					System.out.println();
				}
				System.out.printf("%c: %.2f%%  ", j, rlt);
				pcnt++;
			}
		}
	}

	public static void countNum(int n) {
		double cnt1 = 0, cnt2 = 0, rlt1, rlt2;
		int[] rand = new int[n];
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (2000 + Math.random() * (3000 - 2000 + 1));
		}
		for (int x : rand) {
			if (x > 2500)
				cnt1++;
			else
				cnt2++;
		}
		rlt1 = cnt1 / rand.length * 100.0;
		rlt2 = cnt2 / rand.length * 100.0;
		System.out.printf(">2500: %.2f%%\n<=2500: %.2f%%", rlt1, rlt2);
		System.out.println();
	}
}