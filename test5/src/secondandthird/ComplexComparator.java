package secondandthird;

import java.util.Comparator;

//复合比较器
public class ComplexComparator implements Comparator<Staff> {

	@Override
	public int compare(Staff o1, Staff o2) {
		// 选择sex和salary
		if (o1.getSex() == o2.getSex()) {
			return (int) (o1.getSalary() - o2.getSalary());
		} else if (o1.getSex() > o2.getSex())
			return 1;
		else {
			return -1;
		}
	}
}
