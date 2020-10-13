package NewPerson;

public class TestPerson {
	// 测试类,对Person进行测试
	public static void main(String[] args) {
		Person p1 = new Person("Paul", 24);
		Person p2 = new Person("Sally", "M", 19);// 实例化
//		System.out.println("p1.ID: " + p1.getId());
//		System.out.println("p2.ID: " + p2.getId());
		System.out.println(p1); // toString
		System.out.println(p2);
	}

}
