package one;

import java.util.*;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}

	public static void start() {
		List<Thread> threads = new ArrayList<Thread>();
		threads.add(new Thread(new ReceiveMailRunnable()));
		threads.add(new Thread(new ReceiveMailRunnable()));
		threads.add(new Thread(new ReceiveMailRunnable()));
		threads.add(new Thread(new SendMailRunnable()));
		threads.add(new Thread(new SendMailRunnable()));
		threads.add(new Thread(new SendMailRunnable()));

		for (Thread t : threads) {
			t.start();
		}

		for (Thread t : threads) {
			try {
				t.join(); // 主线程等待所有子线程结束
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("foxmail任务结束");
	}

}
