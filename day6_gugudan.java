package test;

import java.util.Scanner;

public class day6_gugudan {
	
	public static void gugu(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	public static void gogo(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	
	public static void main(String[] args) {
		// 구구단 만들기
		// Scanner를 이용해 입력값을 받아
		// 구구단을 원하는 단이 나오게 해주세요.

		// 예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

		// 4단 출력.
		Scanner scan = new Scanner(System.in);
		// 반복 조건을 업애는 무한 반복.

		// 반복문을 중간에 종료하는 방법
		// break = 반복문 강제 종료
		System.out.print("===구구단 프로그램을 시작합니다.===\n");

		// int dan = int i = 1)
		for (int i = 0;; i++) {
			System.out.print("원하는 단을 입력해주세요(종료는 0) : ");
			int dan = Integer.parseInt(scan.nextLine());

			if (dan == 0) {
				System.out.print("구구단 프로그램을 종료합니다.");
				break;
			}
			gogo(dan);
		}
	}
}