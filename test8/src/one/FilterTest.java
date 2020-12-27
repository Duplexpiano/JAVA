package one;

import java.io.*;
import java.util.Scanner;

public class FilterTest {

	public static void main(String[] args) {
		// TODO: test Filter
		start();
	}

	public static void start() {
		Student s = new Student(21, "Dom", 28, 94.50);
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream("2nd.txt"));
			writeStudent(s, pw);
			pw.close();

			Scanner scanner = new Scanner(new FileReader("2nd.txt"));
			System.out.println(readStudent(scanner));
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Ð´Èë
	public static void writeStudent(Student s, PrintWriter pw) {
		pw.print(s.getId() + " ");
		pw.print(s.getName() + " ");
		pw.print(s.getAge() + " ");
		pw.print(s.getGrade());
	}

	// ¶Á³ö
	public static Student readStudent(Scanner scanner) throws IOException {
		scanner.useDelimiter(" ");
		Student s = new Student(scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.nextDouble());
		return s;
	}
}
