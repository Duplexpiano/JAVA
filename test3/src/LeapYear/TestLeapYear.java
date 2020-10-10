package LeapYear;


public class TestLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = (int) (2021 * Math.random());//随机生成0-2020之间的整数
		LeapYear leapyear = new LeapYear(year);
		if(leapyear.isLeapYear(year)) {
			System.out.println(year+" is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}

}
