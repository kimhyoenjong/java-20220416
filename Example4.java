
public class Example4 {

	public static void main(String[] args) {
		//
	    // arr �迭�� 10, 20, 30, 40, 50, 60, 70, 80, 90, 100�� �����ϰ� ������ּ���.
		
//		int[] numArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; //�����迭
//		
//		System.out.println(numArr[0]);
//		System.out.println(numArr[1]);
//		System.out.println(numArr[2]);
//		System.out.println(numArr[3]);
//		System.out.println(numArr[4]);
//		System.out.println(numArr[5]);
//		System.out.println(numArr[6]);
//		System.out.println(numArr[7]);
//		System.out.println(numArr[8]);
//		System.out.println(numArr[9]);
//		
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(intArr[i]);
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			
//		}
//			arr2[i]
//		}
		
		// �л� ���� ����
		
		// �л� �̸�
		String[] names = {"ö��", "����", "��ö", "����", "�浿"};
		
		// �л� ����
		int[] scores = {100, 90, 80, 92, 60};
		
		// �л����� ���� ����
		double sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		
		// 1������ ��
		// 0 + 1
		
		// ���� : ���� ������� ����
		// 1. �л����� ���� ���
		
		// �Ǽ��� ������ ������ ����
		// ������ ��������, �Ǽ��� �Ǽ�����.
	
		double avg = sum/names.length;
		System.out.println(avg);
		
		// 2. ��� �̻��� �л� ���
		for(int i = 0; i < scores.length; i++) 
			if (scores[i] > avg) {
				System.out.println(names[i]);
			}
		
		// 3. ������ ���� ���� �л� ���
		
		// 4. ������ ���� ���� �л� ���
		
		int max = scores[0];
		int targen = 0;
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println(names[i]);
		
		
	}

}
