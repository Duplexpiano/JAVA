package three;

import java.util.*;

public class Util {

	{
		System.out.println("-running..");
	}

	// 随机生成n个学生的列表
	public static List<Student> getRandomStudents(int n) {
		List<Student> stus = new ArrayList<Student>();
		ListIterator<Student> lt = stus.listIterator();

		while (lt.nextIndex() != n) {
			Student e = new Student();
			e.setName(Util.getRandomName(0, 5));
			e.setAge(Util.getRandomAge(0, 80));
			lt.add(e);
		}

		return stus;
	}

	// 获取一个随机名字
	public static String getRandomName(int min, int max) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		char result = 0;

		for (int i = min; i < max; i++) {
			if (i == min) {
				result = (char) ('A' + (Math.random() * ('Z' - 'A' + 1)));
				sb.append(result);
			} else {
				result = (char) ('a' + (Math.random() * ('z' - 'a' + 1)));
				sb.append(result);
			}
		}

		return sb.toString();
	}

	// 生成一个随机年龄
	public static int getRandomAge(int min, int max) {
		// TODO Auto-generated method stub
		int age = (int) (min + Math.random() * (max - min));
		return age;
	}

	// 生成studentMap
	public static Map<String, Student> makeStudentMap(List<Student> stuList) {
		Map<String, Student> stuMap = new HashMap<>();
		for (Student s : stuList) {
			stuMap.put(s.getName(), s);
		}
		return stuMap;
	}

	// 索引name
	public static String searchName(List<String> nameList, String name) {
		ListIterator<String> lt = nameList.listIterator();

		while (lt.hasNext()) {
			if (lt.next().equals(name)) {
				return name;
			}
		}

//		if(nameList.contains(name)) {
//			return name;
//		}

		System.out.println("Not Find(nameList)");
		return null;
	}

	// Map中根据name索引学生
	public static Student searchStudent(Map<String, Student> stuMap, String name) {
		if (stuMap.containsKey(name)) {
			return stuMap.get(name);
		}
		System.out.println("Not Find(stuMap)");
		return null;
	}

	// 生成n个字符串的NameList并返回
	public static List<String> generateNameList(int n) {
		List<String> nameList = new ArrayList<String>();
		ListIterator<String> lt = nameList.listIterator();

		while (lt.nextIndex() != n) {
			lt.add(Util.getRandomName(0, 5));
		}

		return nameList;
	}

	// 生成包含n个键的的StudentMap并返回
	public static Map<String, Student> generateStudentMap(int n) {
		List<Student> stuList = getRandomStudents(n);
		Map stuMap = makeStudentMap(stuList);
		return stuMap;
	}

	// 打印map
	public static void printStudentMap(Map<String, Student> stuMap) {
		int i = 0;
		for (Map.Entry<String, Student> e : stuMap.entrySet()) {
			if (i < 10) {
				System.out.println("Map<" + i + "> : ");
				System.out.println("Key: " + e.getKey() + "\nValue: " + e.getValue());
				System.out.println("Entry<k, v>: " + e);
				System.out.println("--------------------------------------------------");
			} else {
				break;
			}
			i++;
		}
	}
}
