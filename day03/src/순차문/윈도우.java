package 순차문;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();		// 새로운 JFrame f 생성
		f.setSize(1000, 800);			// frame 사이즈 (width, height)
		
		JButton b1 = new JButton();		// 새로운 JButton b1, b2 생성
		JButton b2 = new JButton();
		b1.setText("나는 첫번째 버튼");		// 버튼 속 내용 입력
		b2.setText("나는	두번째 버튼");
		
		f.add(b1);						// frame에 b1,b2 삽입
		f.add(b2);
		
		FlowLayout flow = new FlowLayout();		// flowlayout이라는 배치 component
		f.setLayout(flow);						// frame 속 button 배치 방식을 flow로 설정
		
		
		//set Visible 전에 입력된 값은 적용되지 않는다. 
		f.setVisible(true);			// true:표시 false:표시하지않음
	}

}
