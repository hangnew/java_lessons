package 스레드;

public class Image1 extends Thread {
	@Override
	public void run() {
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // for
	} // run
} // class
