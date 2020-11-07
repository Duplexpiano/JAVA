package fourth;

public class TestEnum {

	public static void main(String[] args) {
		City[] cities = City.values();
		University[] us = University.values();
		int i = 0, j = 0;
		for (City c : cities) {
			System.out.println("city[" + (i++) + "] : " + c + " " + c.getCityString());
		}
		for (University u : us) {
			System.out.println("university[" + (j++) + "] : " + u + " " + u.getUniversityString() + " "
					+ u.getCity().getCityString());
		}

//		System.out.println(us[0].JMU.toString());
	}

}
