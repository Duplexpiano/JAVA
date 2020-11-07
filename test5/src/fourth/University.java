package fourth;

public enum University {
	JMU("集美大学", City.XIAMEN), XMU("厦门大学", City.XIAMEN), BJU("北京大学", City.BEIJING);

	private String universityString;	// 中文描述
	private City city;	// 城市(City类型)

	private University(String universityString, City city) {
		this.universityString = universityString;
		this.city = city;
	}

	public City getCity() {
		return city;
	}

	public String getUniversityString() {
		return universityString;
	}

}
