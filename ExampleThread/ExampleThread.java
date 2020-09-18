package ExampleThread;

class TicketWindow extends Thread {
	private int tickets = 100;// 变量用static修饰做对比
	private static Object o = new Object();

	public void run() {
		// 通过死循环语句，打印语句
		while (true) {
			synchronized (o) {
				if (tickets > 0) {
					// 获取当前线程的名称
					Thread th = Thread.currentThread();
					String th_name = th.getName();
					System.out.println(th_name + "正在发售第" + tickets-- + "张票");
				}
			}
		}
	}
}

public class ExampleThread {
	public static void main(String[] args) {
		TicketWindow t1 = new TicketWindow();
		TicketWindow t2 = new TicketWindow();
		TicketWindow t3 = new TicketWindow();
		TicketWindow t4 = new TicketWindow();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
