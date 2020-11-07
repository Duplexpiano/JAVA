package secondandthird;

import java.time.LocalDate;

public class Staff implements Comparator<Staff> {
	private String name;
	private String address;
	private int age;
	private int sex; // 0:Female, 1:male
	private double salary; // 工资
	private LocalDate dateHired; // 雇佣日期

	/**
	 * @param name
	 * @param address
	 * @param age
	 * @param sex
	 * @param salary
	 * @param dateHired
	 */
	public Staff(String name, String address, int age, int sex, double salary, LocalDate dateHired) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public int getSex() {
		return sex;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(LocalDate dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", age=" + age + ", sex=" + sex + ", salary=" + salary
				+ ", dateHired=" + dateHired + "]";
	}

	@Override
	public int compare(Staff o1, Staff o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
