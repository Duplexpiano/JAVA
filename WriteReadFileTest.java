package WriteReadFileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.util.Arrays;

public class WriteReadFileTest {
	static String filePath_a = "D:\\\\Program Files\\\\eclipse\\\\stuInfo1.0.txt";
	static String filePath_b = "D:\\Program Files\\eclipse\\stuInfo2.0.txt";
	String filePath_c = "D:\\Program Files\\eclipse\\first_10.txt";
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		PrintWriter out = new PrintWriter(filePath_a);
		out.println("Name Math Java Ds Average Toal");

		String students[] = new String[10000];
		for (int i = 0; i < students.length; i++) {
			students[i] = getStudent(i);
		}
		for (String x : students) {
			out.println(x);
		}
		out.close();
		Scanner in = new Scanner(new File(filePath_a));
		PrintWriter Out = new PrintWriter(filePath_b);
		Out.println("Name Math Java Ds Average Toal");
		int number = 1, k = 0;
		while (in.hasNextLine() && k < students.length) {
			String line = in.nextLine();
			if (number > 1) {
				Scanner linescanner = new Scanner(line);// 对每一行的内容建立一个扫描器
				linescanner.useDelimiter(" "); // 使用space作为分隔符
				String name = linescanner.next();
				String math = linescanner.next();
				String java = linescanner.next();
				String ds = linescanner.next();
				String avg = linescanner.next();
				String total = linescanner.next();
				int t = Integer.parseInt(math) + Integer.parseInt(java) + Integer.parseInt(ds);
				int a = t / 3;
				avg = a + "";
				total = t + "";
				String student = String.join(" ", name, math, java, ds, avg, total);
				students[k] = student;
				Out.println(students[k++]);
				linescanner.close();
			}
			number++;
		}
		Out.close();
		in.close();
		rank();
		System.out.println("请输入学生名字:");
		String name = sc.nextLine();
		System.out.println(findStudent(name, filePath_b));
		sc.close();
	}

	// 获取学生信息，格式类似 "张三i 80 85 90 0 0"
	public static String getStudent(int i) {
		String name = "张三" + i + " ";
		String score = "";
		for (int j = 0; j < 3; j++) {
			score += getScore() + " "; // 转为String类型
		}
		return name + score + 0 + " " + 0;

	}

	// 获取0-100的随机数
	public static int getScore() {
		return (int) (Math.random() * 101);
	}

	public static void name() {

	}

	// 查找学生
	public static String[] findStudent(String name, String path) throws FileNotFoundException {
		Scanner in = new Scanner(new File(path));
		String[] rlt = new String[10];
		int cnt = 0;
		in.nextLine();
		while (in.hasNextLine()) {
			String line = in.nextLine();
			Scanner linescanner = new Scanner(line);
			linescanner.useDelimiter(" ");
			if (linescanner.next().equals(name)) {
				rlt[cnt] = line;
				cnt++;
				System.out.println(line);
			}
			linescanner.close();
		}
		in.close();

		return rlt;
	}
	
	public static void rank()throws FileNotFoundException {
		Scanner in = new Scanner(new File(filePath_b));
		in.nextLine();

	}
}
