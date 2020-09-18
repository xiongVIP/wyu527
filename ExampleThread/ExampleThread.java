package ExampleThread;

class TicketWindow extends Thread {
	private int tickets = 100;// ������static�������Ա�
	private static Object o = new Object();

	public void run() {
		// ͨ����ѭ����䣬��ӡ���
		while (true) {
			synchronized (o) {
				if (tickets > 0) {
					// ��ȡ��ǰ�̵߳�����
					Thread th = Thread.currentThread();
					String th_name = th.getName();
					System.out.println(th_name + "���ڷ��۵�" + tickets-- + "��Ʊ");
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
