package CountAlp;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Scanner;

public class CountFileAlp {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("D:\\Program Files\\eclipse\\Object.txt"));
		double totl = 0; // 总字符数
		int[] cnt = new int[26];
		int num = 0, rowlength = 7;
		while (in.hasNextLine()) {
			String line = in.nextLine();
			char[] tmp = line.toCharArray();
			for (char x : tmp) {
				for (int i = 0; i < cnt.length; i++) {
					if (x == 'a' + i || x == 'A' + i) {
						cnt[i]++;
					}
				}
			}
			totl += tmp.length;
		}
		System.out.println("Object文档中a-z出现的频率:");
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				double ret = cnt[i] / totl;
				if (num != 0 && num % rowlength == 0) {
					System.out.println();
				}
				System.out.printf(" %c = %.2f%%", 'a' + i, ret * 100);
				num++;
			}
		}
	}

}
