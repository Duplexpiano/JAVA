package student;

import java.io.FileNotFoundException;

public class TestStudent {
	//ÎÄ±¾µØÖ·
	static String filePath = "D:\\Program Files\\eclipse\\test3\\src\\student\\Student.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		Student[] stus = Student.readStudentsFromFile(filePath);
		Student.sort(stus);
		System.out.println("---------------------------------");
		for(Student x: stus) {
			System.out.println("average = "+ x.getAvg() + " Total = " + x.getTotal());
		}
	}
}
