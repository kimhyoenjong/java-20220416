package test;

import java.util.Scanner;

public class scanner {

	public static String vendingMachine(int inputMoney, int bno) {
		// ���� ���
		String[] beverageNames = {"�ݶ�", "���̴�", "Ŀ��", "����"};
		int[] beveragePrices = {1200, 1000, 800, 600};
		
		System.out.printf("���� �ݾ��� %d�Դϴ�.\n", inputMoney);
		
		if(inputMoney < beveragePrices[bno]) {
			System.out.println("�ܾ��� �����մϴ�.");
			return null;
		}
		
		System.out.printf("%s�� �����̽��ϴ�.\n", beverageNames[bno]);
		
		
		int remainder = inputMoney - beveragePrices[bno];
		System.out.printf("�ܾ��� %d�Դϴ�.\n", remainder);
		
		return beverageNames[bno];
		
		
	}
	
	public static void main(String[] args) {

		// ��Ʈ�� + ����Ʈ + O
		Scanner scan = new Scanner(System.in);
		
		// ��, ���� ����� 
		// 0 - �ݶ�(1200), 1 - ���̴�(1000), 2 - Ŀ��(800), 3 - ����(600)
		
		System.out.println("=============== ����� ��� ===============");
		System.out.println("0 : �ݶ�   (1200��)");
		System.out.println("1 : ���̴� (1000��)");
		System.out.println("2 : Ŀ��   (800 ��)");
		System.out.println("3 : ����   (600 ��)");
		System.out.println("===========================================");
		System.out.println("���� �ݾ��� �����Ͻðڽ��ϱ� : ");
		int inputMoney = Integer.parseInt(scan.nextLine());
		
		System.out.print("� ������� �����Ͻðڽ��ϱ� : ");
		int bno = Integer.parseInt(scan.nextLine());
		
		
		String beverage = vendingMachine(inputMoney, bno);
		
		if(beverage == null) {
			System.out.println("ȫ�浿�� ������� ���� ���߽��ϴ�.");
		} else {			
			System.out.printf("ȫ�浿�� %s�� �������� ���ʴϴ�.\n", beverage);
		}
		
//		
//		String beverage2 = vendingMachine(1000, 3);
//		
//		if(beverage2 == null) {
//			System.out.println("ȫ����� ������� ���� ���߽��ϴ�.");
//		} else {			
//			System.out.printf("ȫ����� %s�� �������� ���ʴϴ�.\n", beverage2);
//		}	
	}

}