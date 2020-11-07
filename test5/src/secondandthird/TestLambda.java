package secondandthird;

import java.time.LocalDate;
import java.util.Arrays;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2001, 8, 07);
		Staff[] staffs = new Staff[4];
		staffs[0] = new Staff("Cat", "514", 36, 1, 3000, date);
		staffs[1] = new Teacher("Computer technique", "SE", 2000, "Judy", "437", 40, 1, 7000, date.plusYears(2));
		staffs[2] = new SecurityGuard("talk", 1000, "Bob", "011", 29, 0, 4000, date.minusYears(4));
		staffs[3] = new Dean("Computer technique", "SE", 2000, "Sally", "501", 54, 0, 12000, date.minusYears(10), 5000);
		// 测试顺序
		sortByAge(staffs);
		printAge(staffs);
		sortByName(staffs);
		printName(staffs);
		sortByComplex(staffs);
		printComplex(staffs);
		sortBySalary(staffs);
		printSalary(staffs);
		sortByDateHired(staffs);
		printDateHired(staffs);
	}

	// 输出薪水
	private static void printSalary(Staff[] staffs) {
		System.out.println("Sort salary(descending order): ");
		for (Staff x : staffs) {
			System.out.println(x.getName() + " : " + x.getSalary());
		}
	}

	// 输出名字
	private static void printName(Staff[] persons) {
		System.out.println("Sort name(ascending order): ");
		for (Staff x : persons) {
			System.out.println("Name: " + x.getName());
		}
	}

	// 输出年龄
	private static void printAge(Staff[] staffs) {
		System.out.println("Sort age(ascending order): ");
		for (Staff x : staffs) {
			System.out.println(x.getName() + " : " + x.getAge());
		}
	}

	// 输出复合比较器比较结果
	private static void printComplex(Staff[] staffs) {
		System.out.println("sort ComplexComparator(descending order): ");
		for (Staff x : staffs) {
			System.out.println("Sex: " + x.getSex() + ", Salary: " + x.getSalary());
		}
	}

	// 输出雇佣日期
	private static void printDateHired(Staff[] staffs) {
		System.out.println("sort DateHired(ascending order): ");
		for (Staff x : staffs) {
			System.out.println("Name: " + x.getName() + ", DateHired: " + x.getDateHired());
		}
	}

	// 降序排序薪水
	private static void sortBySalary(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> {
			return (int) (o2.getSalary() - o1.getSalary());
		});

	}

	// 升序排序年龄
	private static void sortByAge(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> {
			return o1.getAge() - o2.getAge();
		});
	}

	// 升序排序姓名
	private static void sortByName(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
	}

	// ComplexComparator使用lambda表达式实现
	private static void sortByComplex(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> {
			if (o1.getSex() == o2.getSex()) {
				return (int) (o2.getSalary() - o1.getSalary());
			} else if (o1.getSex() > o2.getSex())
				return 1;
			else {
				return -1;
			}
		});
	}

	// 升序排雇佣日期
	private static void sortByDateHired(Staff[] staffs) {
		Arrays.sort(staffs, (o1, o2) -> {
			return o1.getDateHired().compareTo(o2.getDateHired());
		});

	}
}
