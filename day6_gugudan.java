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
		// ������ �����
		// Scanner�� �̿��� �Է°��� �޾�
		// �������� ���ϴ� ���� ������ ���ּ���.

		// ����) ���ϴ� ���� �Է����ּ��� : 4 (�Է��� ����)

		// 4�� ���.
		Scanner scan = new Scanner(System.in);
		// �ݺ� ������ ���ִ� ���� �ݺ�.

		// �ݺ����� �߰��� �����ϴ� ���
		// break = �ݺ��� ���� ����
		System.out.print("===������ ���α׷��� �����մϴ�.===\n");

		// int dan = int i = 1)
		for (int i = 0;; i++) {
			System.out.print("���ϴ� ���� �Է����ּ���(����� 0) : ");
			int dan = Integer.parseInt(scan.nextLine());

			if (dan == 0) {
				System.out.print("������ ���α׷��� �����մϴ�.");
				break;
			}
			gogo(dan);
		}
	}
}