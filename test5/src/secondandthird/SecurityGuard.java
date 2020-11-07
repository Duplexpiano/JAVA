package secondandthird;

import java.time.LocalDate;

public class SecurityGuard extends Staff {
	private String skills; // 专技
	private double dangerousAllowance; // 高危津贴

	public String getSkills() {
		return skills;
	}

	public SecurityGuard(String skills, double dangerousAllowance, String name, String address, int age, int sex,
			double salary, LocalDate dateHired) {
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

	// 保安薪水
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
