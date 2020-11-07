package fourth;

public enum City {
	XIAMEN("厦门"), BEIJING("北京"), SHANGHAI("上海");

	private String cityString;	// 中文描述

	private City(String cityString) {
		this.cityString = cityString;
	}

	public String getCityString() {
		return cityString;
	}
}
