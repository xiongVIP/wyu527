package ExampleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//newFixedThreadPool
public class FixThreadPoolDemo {

	public static void main(String args[]) {

		ExecutorService pool = Executors.newFixedThreadPool(10);
		for (int i = 0; i <= 15; i++) {
			pool.execute(() -> {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println(Thread.currentThread().getName() + "[runing done]");
			});
		}
	}
}