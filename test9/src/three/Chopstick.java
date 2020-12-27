package three;

public class Chopstick {
	private int Id;

	public Chopstick(int Id) {
		this.Id = Id;
	}

	public int getId() {
		return this.Id;
	}

	@Override
	public String toString() {
		return "Chopstick [Id=" + Id + "]";
	}

}
