package 스레드;

import java.util.Date;

public class Timer1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for
	} // run
} // class
