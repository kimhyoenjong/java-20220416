import java.util.Random;

public class Solution1 {
	public static void main(String[] args) {
		
	// 정수 : int, 실수(소수) : double, 문장 : String

//    System.out.println(i); // 출력 : 100
//    System.out.println(d); // 출력 : 3.14
//    System.out.println(s); // 출력 : 안녕하세요
//    System.out.println(i); // 출력 : 200
//    System.out.println(d); // 출력 : 10.5
//    System.out.println(s); // 출력 : 반갑습니다.
		int i = 100;
		double d = 3.14;
		String s = "안녕하세요";
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
		
		i = 200;
		d = 10.5;
		s = "반갑습니다.";
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		
		// 2번 문제
//		int a = 5;
//	    int b = 10;
//
//	    System.out.println("a : " + a);
//	    System.out.println("b : " + b);
//	   
//	    // 여기서 부터 
//	    
//	    // 여기까지 수정 가능
//	    
//	    System.out.println("a : " + a);
//	    // 출력 : a : 10
//	    System.out.println("b : " + b);
//	    // 출력 :  b : 5
	    
	    
	    // 3번 문제
	    Random ran = new Random();

	    // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
	    // `int` => a라는 공간에는 정수만 담을 수 있다.
	    // `;` => 문장이 끝남을 알린다.
	    int a;
	    a = ran.nextInt(100);
	    int b = ran.nextInt(100);
	    
	    
	    // `+` => 문장과 문자을 합친다.
	    System.out.println("a : " + a);
	    System.out.println("b : " + b);
	    
	    // 여기서 부터 
	    int c;
	    c= a;
	    a=b;
	    b=c;


	    // 여기까지 수정 가능
	    
	    System.out.println("a : " + a);
	    // 출력 : a : b의 값
	    System.out.println("b : " + b);
	    // 출력 :  b : a의 값
	    
	}
}
