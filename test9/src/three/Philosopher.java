package three;

public class Philosopher implements Runnable {
	private int pos;
	private Chopstick left;
	private Chopstick right;

	public Philosopher(Chopstick left, Chopstick right, int pos) {
		// 构造方法传入保证统一对象
		this.left = left;
		this.right = right;
		this.pos = pos;
	}

	@Override
	public void run() {
		int k = pos; // 将philosopher的position分为奇、偶数: 奇数: think， 偶数: eat;
		System.out.println(Thread.currentThread().getName() + " start" + ", K: " + k);
		if (k % 2 == 0) {
			this.eating();
		} else {
			this.thinking();
		}
	}

	private void eating() {
		// TODO: eat
		try {
			synchronized (left) { // 锁定左筷子
				synchronized (right) { // 锁定右筷子
					System.out
							.println("Pho<" + (pos + 1) + "> is eating, left chop: " + left + ", right chop: " + right);

					Thread.sleep(1000);
				}
			}
			this.thinking(); // eating后进入thinking状态
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void thinking() {
		// TODO: think
		try {
			System.out.println("Pho<" + (pos + 1) + "> is thinking");
			Thread.sleep(1000); // 模拟思考时间
			this.eating(); // 思考后开始用餐
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
