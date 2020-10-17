package staff;

import java.util.Date;

public class Dean extends Teacher {
	private double adminAward; // ÐÐÕþ½±½ð

	public double getAdminAward() {
		return adminAward;
	}

	public Dean(String department, String speciality, double postAllowance, String name, String address, int age,
			int sex, double salary, Date dateHired, double adminAward) {
		super(department, speciality, postAllowance, name, address, age, sex, salary, dateHired);
		this.adminAward = adminAward;
	}

	public void setAdminAward(double adminAward) {
		this.adminAward = adminAward;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + this.adminAward;
	}

	@Override
	public String toString() {
		return "Dean [adminAward=" + getAdminAward() + ", salary=" + getSalary() + ", department=" + getDepartment()
				+ ", speciality=" + getSpeciality() + ", postAllowance=" + getPostAllowance() + ", name=" + getName()
				+ ", address=" + getAddress() + ", age=" + getAge() + ", sex=" + getSex() + ", dateHired="
				+ getDateHired() + "]";
	}

}
