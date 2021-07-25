package 파일시스템;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에쓰기 {

	public static void main(String[] args) {

		try {
			// 1. txt 스트링을 file 객체로 생성
			// 2. txt파일과 java간의 stream 생성
			String day = JOptionPane.showInputDialog("날짜 입력");
			String title = JOptionPane.showInputDialog("제목 입력");
			String content = JOptionPane.showInputDialog("내용 입력");
			String weather = JOptionPane.showInputDialog("날씨 입력");
			FileWriter file = new FileWriter(day + ".txt");
			// 3. stream으로 데이터 보내기
			file.write(day + "\n");
			file.write(title + "\n");
			file.write(content + "\n");
			file.write(weather + "\n");
			file.close();
			JOptionPane.showMessageDialog(null, "일기 기록됨");
		} catch (IOException e) {
			System.out.println("파일 저장하는 동안 에러발생");
		}

	} // main

}
