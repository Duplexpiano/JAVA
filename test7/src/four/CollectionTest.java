package four;

import three.Util;
import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stus = new Student[100];
		stus = getStudent(100); //获得100个随机Student对象

		System.out.println("Original student array: ");
		printStudentArray(stus); //print
		System.out.println("--------------------------------------");
		
		List<Student> stuList = new ArrayList<Student>();
		stuList = arrayToList(stus); //转列表

		Collections.sort(stuList); //sort
		System.out.println("Sort student list: ");
		printStudentList(stuList); //print
		System.out.println("--------------------------------------");
		Student minStudent = Collections.min(stuList); //min
		Student maxStudent = Collections.max(stuList); //max
		System.out.println("min: " + minStudent);
		System.out.println("max: " + maxStudent);

		int index = Collections.binarySearch(stuList, new Student(60), new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO 获得等于60分的Student
				return o1.getGrade() - o2.getGrade();
			}

		});
		if (index >= 0) {
			System.out.println(stuList.get(index));
		} else {
			System.out.println("Not find the student of grade of 60..");
		}
		System.out.println("--------------------------------------");

		List<Student> otherList = searchFailStudent(stuList); //索引不及格学生
		boolean ret = stuList.removeAll(otherList); //removeAll
		if (ret) {
			Collections.shuffle(stuList); //shuffle
			System.out.println("Student list after remove otherList: ");
			printStudentList(stuList);
			System.out.println("--------------------------------------");

			stus = listToArray(stuList); //转为数组
			System.out.println("Final student array: ");
			printStudentArray(stus);
			System.out.println("--------------------------------------");
		}

	}

	// 获取n个学生对对象
	public static Student[] getStudent(int n) {
		Student[] stus = new Student[n];

		for (int i = 0; i < stus.length; i++) {
			stus[i] = new Student(Util.getRandomName(0, 5), Util.getRandomAge(18, 22), (int) (Math.random() * 101));
		}

		return stus;
	}

	// 索引不及格学生
	public static List<Student> searchFailStudent(List<Student> stuList) {
		List<Student> otherList = new ArrayList<Student>(); //若不是ArrayList，则存在异常UnsupportedOperationException

		for (Student s : stuList) {
			if (s.getGrade() < 60) {
				otherList.add(s);
			}
		}
		return otherList;
	}

	// 打印列表
	public static void printStudentList(List<Student> stuList) {
		stuList.forEach(s -> {
			System.out.println(s);
		});
	}

	// 打印数组
	public static void printStudentArray(Student[] stus) {
		for (Student s : stus) {
			System.out.println(s);
		}
	}

	// 数组转列表
	public static List<Student> arrayToList(Student[] stus) {
		List<Student> stuList = new ArrayList<Student>();

		for (Student s : stus) {
			stuList.add(s);
		}
		return stuList;
	}
	
	//列表转数组
	public static Student[] listToArray(List<Student> stuList) {
		Student[] stus = new Student[stuList.size()];
		
		for(int i = 0; i < stuList.size(); i++) {
			stus[i] = stuList.get(i);
		}
		
		return stus;
	}
}
