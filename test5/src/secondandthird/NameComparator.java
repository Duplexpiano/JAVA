package secondandthird;

import java.util.Comparator;

// ĞÕÃû±È½ÏÆ÷
public class NameComparator implements Comparator<Staff> {

	@Override
	public int compare(Staff o1, Staff o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
