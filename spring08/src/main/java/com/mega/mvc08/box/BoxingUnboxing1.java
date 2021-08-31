package com.mega.mvc08.box;

import javax.swing.JOptionPane;

public class BoxingUnboxing1 {

	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("나이 입력");
		int age2 = Integer.parseInt(age);
		System.out.println(age2 + 1);
		
	}

}
