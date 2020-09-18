package ExampleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//newSingleThreadExecutor
public class SingleThreadExecutorDemo {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			pool.execute(() -> System.out.println(Thread.currentThread().getName() + "[running done]"));
		}
	}
}
