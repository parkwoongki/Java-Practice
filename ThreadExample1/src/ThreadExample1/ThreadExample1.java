package ThreadExample1;

/*
 *  os차원에서는 하나의 프로세스로 보임
 *  자바는 자기가 알아서 나눠주는거임
 *  결국 메인 두개를 짜면됨
 *  main() run() 짜고 하면 됨
 */

public class ThreadExample1 {

	public static void main(String[] args) { // 얘가 메인쓰레드가 됨
		// TODO Auto-generated method stub
		CounterThread counterTH = new CounterThread(); // 빨간줄 뜨면 static으로 달아주면됨
		counterTH.start();
		// counterTH.run();
		// 스타트와 run의 차이는 run은 함수 소출하는 거라 main 에서 run을 돌리는 거고
		// start를 통해서 thread를 잡고 run 을 호출하는 개념이다.

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
					return; // 종료 flag가 false일때 종료
					// 일을 계속시키다가 종료시키고 싶을 때 강제로 플래그를 주고 쓰레드가 돌면서 특정에서 false 혹은
					// 다른 쓰레드가 false 시키면됨
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
				try { // IO Interepted 익셉션은 프로그래머가 막을수 있는게 아니기 때문에 try catch로
						// 걸어주면됨
					Thread.sleep(1010);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
