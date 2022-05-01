package test;

public class Example4 {
	
	public static void introduce(Hong hong) {
		System.out.printf("안녕하세요. %d살 %s입니다.\n", hong.age, hong.name);
	}
	public static void main(String[] args) {
		// 사람
		// 나이, 이름
		
		// 22살 홍길동
		
		
		
		// 33살 이순신
		
		
		
		// 자기소개
		Hong h = new Hong(); // new는 Hong이라는 22/홍길동이 들어있는 바구니를 만들겠다.
		
		introduce(h);
		// introduce(Hong);
		//introduce(Lee);
		
		// System.out.printf("안녕하세요. %d살 %s입니다.\n", age2, name2);
	}
}


class Hong{
	static int age = 22;
	static String name = "홍길동";
}

class Lee{
	static int age2 = 33;
	static String name2 = "이순신";
}