package 파일시스템;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {
//		File file = new File("test.txt");
//		boolean result = file.exists();
//		if (result) {
//			System.out.println("파일 존재함");
//			System.out.println(file.getPath());
//		} else {
//			System.out.println("파일 존재하지 않음");
//		}
//		file.delete();
		
		File file = new File("/Users/hangnew/Documents/Data/");
		boolean result = file.exists();
		if (result) {
			System.out.println("파일이나 폴더 존재함");
			System.out.println(file.getAbsolutePath());
			if (file.isDirectory()) {
				System.out.println("폴더입니다");
			} else {
				System.out.println("파일입니다");
			}
		} else {
			System.out.println("파일이나 폴더 존재하지 않음");
		} // if else
		File[] list = file.listFiles();
		System.out.println(list.length);
		for (File file2 : list) {
			System.out.println(file2);
		}
	} // main

} // class
