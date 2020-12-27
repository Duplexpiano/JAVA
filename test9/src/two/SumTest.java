package two;

import java.util.ArrayList;
import java.util.List;

public class SumTest {

	public static void main(String[] args) {
		start();
	}

	public static void start() {
		System.out.println("计算1~1亿的累加和：");

		List<Thread> threads = new ArrayList<Thread>();

		threads.add(new Thread(new SumWorker(1, 10000)));
		threads.add(new Thread(new SumWorker(10001, 1000000)));
		threads.add(new Thread(new SumWorker(1000001, 5000000)));
		threads.add(new Thread(new SumWorker(5000001, 20000000)));
		threads.add(new Thread(new SumWorker(20000001, 100000000)));

		for (Thread t : threads) {
			t.start();
		}

//		for (Thread t : threads) {
//			try {
//				t.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

		System.out.println("计算完毕...");
	}
}
