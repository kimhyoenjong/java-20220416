
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭= ������ ���ϴ°�
		
		int[] numArr = {10, 20, 30, 40, 50}; //�����迭
		
		// �迭�� ��谪�� �׻� ����
		// ���� ->
		// �� -> �迭�� ���� -1
		System.out.println(numArr[4]); // �迭�� ������ 0���� ����.
		
		//Ÿ������ ���ƾ���.
//		String[] StringArr = {"aa", "bb", "cc", 10}; //�ȵ�
//		System.out.println(StringArr[4]); // �迭�� ������ 0���� ����.
		
		//�迭�� �ٽ� ��� �ΰ��� -> �ڷ���(Ÿ��), ����
		
		// ������Է�, ���� ������, �����ͺ��̽� ������ ��� �������� ������ �Է��ϴ� ���� �ƴ� �ܺε����͸� ���� �ҷ��� �� ���
		
		int[] intArr = new int[100];  // �迭�� ����� �Ϲ����� ���
		System.out.println(intArr[99]);
		
		// 1. ���� �迭�� 0���� �ʱ�ȭ
		// 2. �׿� �迭�� null�� �ʱ�ȭ.
		// null -> �����Ͱ� ������ ��������� ǥ��. System.out.println();
		
		String[] strArr = new String[10];
		System.out.println(strArr[0]);
		
		// ����
		strArr[0] = "hello";
		String str1 = strArr[0];
		System.out.println(str1);
		
		strArr[1] = "byebye";
		strArr[2] = "hahaha";
		
		// �ϰ� ��ȸ -> �迭 ���� �ݵ�� �ݺ����̶� ���� ����.
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		// �迭�� ���� ������ ����.
		System.out.println(strArr.length);
		System.out.println(intArr.length);
		
		// �迭 ��ü ��ȸ
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		
		
		
		// �ﰢ�� �׸���
//	    int s = 3;
//	    
//	    for(int i = 1; i <= s; i++){
//	    	for(int j = 1; j <= i; j++) {
//	    		System.out.print("*");	    	
//	    	}
//	    	System.out.println();
//	    }
		
		
		
	}
}
