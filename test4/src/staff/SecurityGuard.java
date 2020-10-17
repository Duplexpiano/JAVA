package staff;

import java.util.Date;

public class SecurityGuard extends Staff {
	private String skills; // ×¨¼¼
	private double dangerousAllowance; // ¸ßÎ£½òÌù

	public String getSkills() {
		return skills;
	}

	public SecurityGuard(String skills, double dangerousAllowance, String name, String address, int age, int sex,
			double salary, Date dateHired) {
		super(name, address, age, sex, salary, dateHired);
		this.skills = skills;
		this.dangerousAllowance = dangerousAllowance;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public double getDangerousAllowance() {
		return dangerousAllowance;
	}

	public void setDangerousAllowance(double dangerousAllowance) {
		this.dangerousAllowance = dangerousAllowance;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + this.dangerousAllowance;
	}

	@Override
	public String toString() {
		return "SecurityGuard [skills=" + skills + ", dangerousAllowance=" + dangerousAllowance + ", salary="
				+ getSalary() + ", name=" + getName() + ", address=" + getAddress() + ", age=" + getAge() + ", sex="
				+ getSex() + ", dateHired=" + getDateHired() + "]";
	}

}
