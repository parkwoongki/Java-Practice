package ThreadExample1;

/*
 *  os���������� �ϳ��� ���μ����� ����
 *  �ڹٴ� �ڱⰡ �˾Ƽ� �����ִ°���
 *  �ᱹ ���� �ΰ��� ¥���
 *  main() run() ¥�� �ϸ� ��
 */

public class ThreadExample1 {

	public static void main(String[] args) { // �갡 ���ξ����尡 ��
		// TODO Auto-generated method stub
		CounterThread counterTH = new CounterThread(); // ������ �߸� static���� �޾��ָ��
		counterTH.start();
		// counterTH.run();
		// ��ŸƮ�� run�� ���̴� run�� �Լ� �����ϴ� �Ŷ� main ���� run�� ������ �Ű�
		// start�� ���ؼ� thread�� ��� run �� ȣ���ϴ� �����̴�.

		Thread counterRU = new Thread(new CounterRunnable());
		counterRU.start();

		for (int i = 0; i < 10; i++) {
			if (i == 7)
				counterTH.clearFlag();
			System.out.println("[" + Thread.currentThread().getName() + "]"
					+ "Count : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static class CounterThread extends Thread {
		private boolean mFlag = true;

		@Override
		public void run() {
			// TODO Auto-generated method stub

			for (int i = 0; i < 10; i++) {
				if (mFlag == false) {
					return; // ���� flag�� false�϶� ����
					// ���� ��ӽ�Ű�ٰ� �����Ű�� ���� �� ������ �÷��׸� �ְ� �����尡 ���鼭 Ư������ false Ȥ��
					// �ٸ� �����尡 false ��Ű���
				}
				System.out.println("[" + getName() + "]" + " Count : " + i);
				try {
					Thread.sleep(1020);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		public void clearFlag() {
			mFlag = false;
		}
	}

	private static class CounterRunnable implements Runnable {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 10; i++) {
				System.out.println("[" + Thread.currentThread().getName() + "]"
						+ " Count : " + i);
				try { // IO Interepted �ͼ����� ���α׷��Ӱ� ������ �ִ°� �ƴϱ� ������ try catch��
						// �ɾ��ָ��
					Thread.sleep(1010);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
