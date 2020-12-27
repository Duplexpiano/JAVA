package one;

//¹¤¾ßÀà
public class Util {

	public static int getRandomTime() {
		return (int) (1000 + Math.random() * (2000 - 1000 + 1));
	}

	public static int getRandoCount() {
		return (int) (10 + Math.random() * (20 - 10 + 1));
	}
}
