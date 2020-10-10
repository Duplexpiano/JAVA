package Person;

public class Person {
	private String name;
	private String sex;
	private int age;

	public Person() {
		name = "";
		sex = "";
		age = 0;
	}

	public Person(String name, String sex, int age) {
		this();
		setName(name);
		setSex(sex);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ¸²¸ÇtoString()·½·¨
	@Override
	public String toString() {
		return "Person: " + getName() + " " + getSex() + " " + getAge();
	}
}
