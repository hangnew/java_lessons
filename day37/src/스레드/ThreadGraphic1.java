package 스레드;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic1 extends JFrame{

	// static : 객체 생성 없이도 메서드나 변수를 cpu가 바로 호출 가능하다.
	// ram에 상주하고 있기 때문에 언제든지 cpu가 접근 가능하다.
	// 메모리 관리 차원에서 static 남용은 좋지 않다.
	JLabel count, image, timer;
	
	public ThreadGraphic1() {
		setSize(800, 350);
		setTitle("나의 스레드 프로그램");
		count = new JLabel("카운터");
		image = new JLabel();
		timer = new JLabel("타이머");
		Font font = new Font("Apple SD Gothic Neo", Font.BOLD, 40);
		Font font2 = new Font("Apple SD Gothic Neo", Font.BOLD, 30);
		count.setFont(font);
		timer.setFont(font2);
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		Count2 thread1 = new Count2();
		Image2 thread2 = new Image2();
		Timer2 thread3 = new Timer2();
		thread1.start();
		thread2.start();
		thread3.start();
		setVisible(true);
	}
	
	
	// 클래스 간 변수를 공유할 목적으로 클래스 내에 클래스를 끼워 넣을 수 있다.
	// = inner class, 내부 클래스
	// 내부 클래스는 독립적으로 다른 곳에서 사용될 수 없다.
	public class Count2 extends Thread {
		@Override
		public void run() {
			for (int i = 1000; i >= 0; i -= 2) {
				count.setText("count " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public class Image2 extends Thread {
		@Override
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				//image.setText(list[i]);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // for
		} // run
	} // class
	
	public class Timer2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();
				timer.setText("" + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // for
		} // run
	} // class

	
	public static void main(String[] args) {
		ThreadGraphic1 s = new ThreadGraphic1();
	}
	
}
