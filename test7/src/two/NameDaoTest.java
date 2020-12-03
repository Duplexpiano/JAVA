package two;

import java.util.*;
import java.util.List;

public class NameDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameDaoImpl nd = new NameDaoImpl();
		String[] names = { "Tom", "Jerry", "Bob", "Peter", "Torry", "Sally", "Hash", "Lily", "Momo" };
		List<String> nameList = new ArrayList<String>();
		nameList = nd.getNameFromArray(names); // 获得名单列表

		System.out.println("Name list: ");
		printNameList(nameList); // 打印列表

		String name = "Lily"; // 需要remove的名字

		int index = nd.searchName(nameList, name); // 获得name在列表中的下标
		System.out.println(index + ": " + name);
		nd.removeFromList(nameList, index);

		System.out.println("--------------------");
		System.out.println("New name list: ");
		printNameList(nameList); // 打印新列表
	}

	public static void printNameList(List<String> nameList) {
		System.out.println("--------------------");
		for (String n : nameList) {
			System.out.println(n);
		}
		System.out.println("--------------------");
	}

}
