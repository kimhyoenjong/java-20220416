package test;

public class Example4 {
	
	public static void introduce(Hong hong) {
		System.out.printf("�ȳ��ϼ���. %d�� %s�Դϴ�.\n", hong.age, hong.name);
	}
	public static void main(String[] args) {
		// ���
		// ����, �̸�
		
		// 22�� ȫ�浿
		
		
		
		// 33�� �̼���
		
		
		
		// �ڱ�Ұ�
		Hong h = new Hong(); // new�� Hong�̶�� 22/ȫ�浿�� ����ִ� �ٱ��ϸ� ����ڴ�.
		
		introduce(h);
		// introduce(Hong);
		//introduce(Lee);
		
		// System.out.printf("�ȳ��ϼ���. %d�� %s�Դϴ�.\n", age2, name2);
	}
}


class Hong{
	static int age = 22;
	static String name = "ȫ�浿";
}

class Lee{
	static int age2 = 33;
	static String name2 = "�̼���";
}