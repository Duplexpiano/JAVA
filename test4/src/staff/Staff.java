package staff;

import java.util.Date;

public class Staff {
	private String name;
	private String address;
	private int age;
	private int sex; // 0:Female, 1:male
	private double salary; // 工资
	private Date dateHired; // 雇佣日期

	/**
	 * @param name
	 * @param address
	 * @param age
	 * @param sex
	 * @param salary
	 * @param dateHired
	 */
	public Staff(String name, String address, int age, int sex, double salary, Date dateHired) {
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

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", age=" + age + ", sex=" + sex + ", salary=" + salary
				+ ", dateHired=" + dateHired + "]";
	}
}
