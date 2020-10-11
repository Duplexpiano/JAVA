package test1;

public class Person {
	private String name;
	private String sex;
	private int age;
	private int id;
	private static int count;
	
	static {
		
	}

	{
		name = "";
		sex = "";
		id = age = 0;
	}

	public  Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, String sex, int age) {
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	// ¸²¸ÇtoString()·½·¨
	@Override
	public String toString() {
		return "Person: " + getName() + " " + getSex() + " " + getAge();
	}
}