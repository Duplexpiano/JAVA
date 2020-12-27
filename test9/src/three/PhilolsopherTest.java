package three;

import java.util.*;

public class PhilolsopherTest {

	public static void main(String[] args) {
		start();
	}

	public static void start() {
		Chopstick a = new Chopstick(0);
		Chopstick b = new Chopstick(1);
		Chopstick c = new Chopstick(2);
		Chopstick d = new Chopstick(3);
		Chopstick e = new Chopstick(4);

		List<Thread> threads = new ArrayList<Thread>();

		threads.add(new Thread(new Philosopher(e, a, 0)));
		threads.add(new Thread(new Philosopher(a, b, 1)));
		threads.add(new Thread(new Philosopher(b, c, 2)));
		threads.add(new Thread(new Philosopher(c, d, 3)));
		threads.add(new Thread(new Philosopher(d, e, 4)));

		for (Thread t : threads) {
			t.start();
		}

	}

}
