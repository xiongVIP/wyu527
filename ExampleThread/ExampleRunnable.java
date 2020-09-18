package ExampleThread;

class TicketWindow1 implements Runnable {
	private int tickets = 100;

	public void run() {
		while (true) {
			synchronized (this) {
				if (tickets > 0) {
					// ��ȡ��ǰ�߳�
					Thread th = Thread.currentThread();
					String th_name = th.getName();
					System.out.println(th_name + "���ڷ��۵�" + tickets-- + "��Ʊ");
				}
			}
		}
	}
}

public class ExampleRunnable {
	public static void main(String[] args) {
		TicketWindow1 tw = new TicketWindow1();
		new Thread(tw, "����1").start(); // �����̶߳��󣬲�����Ϊ����1�������߳�
		new Thread(tw, "����2").start(); // �����̶߳��󣬲�����Ϊ����2�������߳�
		new Thread(tw, "����3").start(); // �����̶߳��󣬲�����Ϊ����3�������߳�
		new Thread(tw, "����4").start(); // �����̶߳��󣬲�����Ϊ����4�������߳�
	}
}