package ExampleThread;

class TicketWindow1 implements Runnable {
	private int tickets = 100;

	public void run() {
		while (true) {
			synchronized (this) {
				if (tickets > 0) {
					// 获取当前线程
					Thread th = Thread.currentThread();
					String th_name = th.getName();
					System.out.println(th_name + "正在发售第" + tickets-- + "张票");
				}
			}
		}
	}
}

public class ExampleRunnable {
	public static void main(String[] args) {
		TicketWindow1 tw = new TicketWindow1();
		new Thread(tw, "窗口1").start(); // 创建线程对象，并命名为窗口1，开启线程
		new Thread(tw, "窗口2").start(); // 创建线程对象，并命名为窗口2，开启线程
		new Thread(tw, "窗口3").start(); // 创建线程对象，并命名为窗口3，开启线程
		new Thread(tw, "窗口4").start(); // 创建线程对象，并命名为窗口4，开启线程
	}
}