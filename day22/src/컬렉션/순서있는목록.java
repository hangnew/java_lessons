package 컬렉션;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) {
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("");
		
		ArrayList list = new ArrayList();
//		ArrayList에 못 넣는 데이터형은 없다.
		list.add("홍길동"); // String
		list.add(100); // int
		list.add(22.22); // double
		list.add(true); // boolean
		list.add('남'); // char
		list.add(new JFrame()); // JFrame
		System.out.println(list.size());
		
		System.out.println(list);
//		list의 주소가 아니라 값이 출력된다. 
//		ArrayList에 자체적으로 toString이 Override된 걸 알 수 있다.
		
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		
		list.add("목요일");
		System.out.println(list.size());
		
		list.remove(5);
		list.remove("홍길동"); // 값으로 직접 remove도 가능하다
//		int값을 remove할 땐 int와 index를 구분할 수 없기 때문에 object 형으로 넣어야 한다
//		list.remove(new Integer(100)); 
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		// index 0 앞에 값을 넣는 방법
		list.add(0, "김길동");
		System.out.println(list);
		
		// index 0 값을 수정하는 방법
		list.set(0, "홍길동");
		System.out.println(list);
	}

}
