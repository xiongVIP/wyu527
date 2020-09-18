package ExampleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {
	private static void mian(String args[]) {
		// TODO Auto-generated method stub
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i <= 10; i++) {
			pool.execute(() -> {
				System.out.println(Thread.currentThread().getName() + "[runing done]");
			});
		}
	}
}
