package staff;

import java.sql.Date;

public class TestStaff {

	public static void main(String[] args) {
		Date date = new Date(1997-12-06);
		Staff[] staffs = new Staff[4];
		staffs[0] = new Staff("Tom", "514", 36, 1, 3000, date);
		staffs[1] = new Teacher("Computer technique", "SE", 2000, "Java", "437", 40, 1, 7000, date);
		staffs[2] = new SecurityGuard("talk", 1000, "Bob", "011", 29, 1, 4000, date);
		staffs[3] = new Dean("Computer technique", "SE", 2000, "Berry", "501", 54, 1, 12000, date, 5000);
		sortBySalary(staffs);
		printSalary(staffs);
		sortByName(staffs);
		printName(staffs);
		sortByAge(staffs);
		printAge(staffs);
//		System.out.println(staffs[3]);
		printAllStaffs(staffs);
	}
	
	private static void printAllStaffs(Staff[] staffs) {
		for(Staff x : staffs) {
			System.out.println(x);
		}
	}
	
	private static void printName(Staff[] persons) {
		System.out.println("Sort name(ascending order): ");
		for(Staff x : persons) {
			System.out.println("Name: " + x.getName());
		}
	}
	
	private static void printSalary(Staff[] staffs) {
		System.out.println("Sort salary(descending order): ");
		for(Staff x : staffs) {
			System.out.println(x.getName() +" : "+ x.getSalary());
		}
	}
	private static void printAge(Staff[] staffs) {
		System.out.println("Sort age(ascending order): ");
		for(Staff x : staffs) {
			System.out.println(x.getName() + " : " + x.getAge());
		}
	}
	private static void sortBySalary(Staff[] staffs) {
		for(int i = 0; i < staffs.length;i++) {
			for(int j = 0; j < staffs.length-1; j++) {
				if(staffs[j].getSalary() < staffs[j+1].getSalary() ) {
					Staff tmp = staffs[j];
					staffs[j] = staffs[j+1];
					staffs[j+1] = tmp;
				}
			}
		}
	}
	private static void sortByAge(Staff[] staffs) {
		for(int i = 0; i < staffs.length;i++) {
			for(int j = 0; j < staffs.length-1; j++) {
				if(staffs[j].getAge() > staffs[j+1].getAge() ) {
					Staff tmp = staffs[j];
					staffs[j] = staffs[j+1];
					staffs[j+1] = tmp;
				}
			}
		}
	}
	
	private static void sortByName(Staff[] staffs) {
		for(int i = 0; i < staffs.length;i++) {
			for(int j = 0; j < staffs.length-1; j++) {
				if(staffs[j].getName().compareTo(staffs[j+1].getName()) > 0 ) {
					Staff tmp = staffs[j];
					staffs[j] = staffs[j+1];
					staffs[j+1] = tmp;
				}
			}
		}
	}
}
