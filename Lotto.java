package test;
import java.util.Scanner;
import java.util.Random;

public class Lotto {
	public static void lotto(int Lotto) {
		
	}
	
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // random��ü�� ������ �߻������ش�.
        // ����.
        // random.nextInt(n) -> 0 ~ n ������ ������ �����ϰ� �ϳ� ����
        // ex)
        // int num = random.nextInt(30);
        // System.out.println(num); // 0 ~ 30 ������ ������ �����ϰ� �ϳ� ���
    
      
        int[] lottoNums = new int[7]; // 1�� ��÷ ��ȣ
        int length = lottoNums.length;

        // �Ʒ��� ���� ����� ��µǵ��� �ζ� ��÷ ��ȣ 7��(���ʽ� ��ȣ ����)�� �������ּ���.
        // 1. ���⿡ ��÷ ��ȣ ���� �ڵ� �ۼ����ּ���.
        // ** �ߺ��� ��ȣ�� ����� ��.
        // ======================================================================================
        
        for(int i = 1; i < 7; i++) {
	        int num = random.nextInt(45);
	        System.out.println(num);
        }


        // ======================================================================================


        // 1 ��� �ڵ�
        // ======================================================================================
        System.out.print("���õ� �ζ� ��ȣ : ");
        System.out.print("���ʽ� ��ȣ : ");

        

        // ======================================================================================

        // ��°��
        // ��÷ ��ȣ : 43, 32, 25, 19, 15, 7, ���ʽ� ��ȣ : 36
    }

}
