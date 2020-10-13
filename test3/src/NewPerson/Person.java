package NewPerson;

public class Person {
	private String name;
	private String sex;
	private int age;
	private int id;
	private static int count;
	// 初始化静态块
	static {

	}
	// 初始化块, 对象每次调用构造器都进行一次
	{
		name = "";
		sex = " ";
		age = 0;
		id = (int) ((int) 100 * Math.random());
	}

	// 第一个构造参数
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		inCount();
		System.out.println("ThisID: " + this.id);
		System.out.println("实时变更记录: count = " + count);
	}

	// 第二个构造参数
	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		inCount();
		System.out.println("ThisID: " + this.id);
		System.out.println("实时变更记录: count = " + count);
	}

	// 获取count的值
	public static int getCount() {
		return count;
	}

	// count自动变更记录
	static void inCount() {
		count++;
	}

	// ¸²¸ÇtoString()·½·¨
	@Override
	public String toString() {
		return "Person: " + this.name + " " + this.sex + " " + this.age + " " + this.id + " " + getCount();
	}
}
