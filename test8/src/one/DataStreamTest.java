package one;

import java.io.*;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO: test DataStream
		start();
	}

	public static void start() {
		Student s = new Student(618, "Ass", 19, 88.88);
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("1st.txt"));
			writeStudent(s, dos);
			dos.close();

			DataInputStream dis = new DataInputStream(new FileInputStream("1st.txt"));
			System.out.println(readStudent(dis));
			dis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ¶Á³ö
	public static Student readStudent(DataInputStream dis) throws IOException {
		Student s = new Student(dis.readInt(), dis.readUTF(), dis.readInt(), dis.readDouble());
		return s;
	}

	// Ð´Èë
	public static void writeStudent(Student s, DataOutputStream dos) {
		try {
			dos.writeInt(s.getId());
			dos.writeUTF(s.getName());
			dos.writeInt(s.getAge());
			dos.writeDouble(s.getGrade());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
