package 파일시스템;

import java.io.File;

public class 파일다루기2 {

	public static void main(String[] args) {
		
		File file = new File("/Users/hangnew/Downloads");
		File[] list = file.listFiles();
		// 폴더 아래 몇 개가 있는지 프린트
		System.out.println("다운로드 폴더에 존재하는 파일/폴더 개수: " + list.length + "개");
		// 무엇이 있는지 프린트해보고, 파일인지 폴더인지 프린트
		System.out.println("파일/폴더들");
		for (File f : list) {
			System.out.println(f);
			if (f.isDirectory()) {
				System.out.println("폴더");
			} else {
				System.out.println("파일");
			}
		} // foreach
		
	} // main

} // class
