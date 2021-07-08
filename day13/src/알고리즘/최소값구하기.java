package 알고리즘;

public class 최소값구하기 {

	public static void main(String[] args) {

//		많은 양의 데이터를 정렬/검색하는 경우 배열에 집어 넣어라
		int[] s = { 90, 80, 20, 60, 70 };

//		전체 n번 순회하면서 해당 index까지의 최소값을 변수에 넣어두는 알고리즘

		int min = s[0]; // 첫번째 값을 넣어 둔다

		for (int i = 1; i < s.length; i++) { // index0값이 이미 min에 들어가있으므로 index1부터 순회하면 된다
			if (s[i] < min) { // 해당 index에 들어있는 값이 min보다 작으면
				min = s[i]; // 그 값을 min에 넣는다
			}
		}

		System.out.println("최소값은 " + min);

	}

}
