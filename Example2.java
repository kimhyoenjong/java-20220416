package test;

public class Example2 {
	// 모든 함수가 같이 사용할 수 있는 변수 -> 전역변수. 
	static int num = 10;
	static int num2 =30;
	
	
	// 함수의 매개변수도 지역변수
	public static void test() {
		int num =10; 
		System.out.println(num2);// 함수는 일반적으로 자신의 지역변수 사용 가능.
	}
	
	public static void main(String[] args) {
		

		
		//지역변수, 변수의 생명주기(스코프)
		
		// 시스템 -> 프로그램 -> 변수를 제거하는 규칙.
		
		// 변수를 지역 안에서 만들면 지역이 끝날 때 변수는 사라진다.(프로그램의 메모리는 한정적!)
		
//		for(int i = 0; i > 10; i++) {
//			System.out.println(i);
//		}
//			int a = 10;
//			
//		{
//			System.out.println(a);
//		}
//		
		System.out.println(num2);
		test();
	}
}
