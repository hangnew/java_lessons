package 문제풀이;

import java.util.Scanner;

public class 자동차점수 {

	public static void main(String[] args) {

//		안전성 점수 (30%) : 100 		=>	100 * 0.3 = 30
//		속도 점수 (50%) : 80			=>	80 * 0.5 = 40
//		연비 점수 (20%) : 60			=>	60 * 0.2 = 12
//		출력 : 82점 우수입니다
//		90점 이상: 최우수, 80점 이상: 우수, 70점 이상: 보통, 그것도 아니면: 미달
		
		Scanner sc = new Scanner(System.in);

		System.out.print("안전성 점수(30%): ");
		double safe = sc.nextDouble() * 0.3;

		System.out.print("속도 점수(50%): ");
		double speed = sc.nextDouble() * 0.5;

		System.out.print("연비 점수(20%): ");
		double oil = sc.nextDouble() * 0.2;

		double result = safe + speed + oil;

		if (result >= 90) {
			System.out.println(result + "점 최우수입니다.");
		} else if (result >= 80){
			System.out.println(result + "점 우수입니다.");
		} else if (result >= 70) {
			System.out.println(result + "점 보통입니다.");
		} else {
			System.out.println(result + "점 미달입니다.");
		}

	}

}
