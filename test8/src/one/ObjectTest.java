package one;

import java.io.*;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO: test ObjectStream
		start();
	}

	public static void start() {
		Student s = new Student(007, "Bob", 24, 87.80);

		try {
			ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream("3rd.txt"));
			writeStudent(s, op);
			op.close();

			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("3rd.txt"));
			System.out.println(readStudent(oi));
			oi.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Ð´Èë
	public static void writeStudent(Student s, ObjectOutputStream op) throws IOException {
		op.writeObject(s);
	}

	// ¶Á³ö
	public static Student readStudent(ObjectInputStream oi) throws IOException, ClassNotFoundException {
		Student s = (Student) oi.readObject();
		return s;
	}
}
