public class MyFirsttApp {
	
	// 주석 - 메모하거나 안쓰는 코드를 잠깐 가릴 떄
	//	컨트롤 + /
	
	// {} : 영역 표현
	// 새로운 영역이 들어오면 들여쓰기(indent)해야한다.
	
	// 시작과 끝(main) 작성 - 메인메서드
	// 프로그램 시작 단출키 : F11
	public static void main(String[] args) {
		// 콘솔에 출력
		// ; (세미콜론) -> 하나의 명령을 마무리함.(명령 구분을 위함)
//		System.out.println(100);
//		System.out.println("hyunjong"); // 문자 표현과 명령어 표현 구분 ->"" 유무
//		System.out.println("안녕하세요");
		
		// 프로그램은 위에서 아래로 순차적으로 실행
		
		// 값 ==> 데이터 ==> 자료
		// 자료형(데이터 타입)
//		System.out.println(100); // 정수(int)
//		System.out.println("100"); // 문자열(string)
//		System.out.println(100.0); // 실수(double)
		
		// 자료형 프로그래밍의 50% 이상의 지분
		// 200을 정수로 3번 출력
		
		// 값을 저장해야한다. -> 변수에 저장
		// 상자만들기 -> 변수 선언
		
		// 상자에 어떤 유형의 데이터를 저장할 것이며, 상자를 어떻게 찾을 것이냐
		int num1;
		
		// 상자에 저장 -> 변수에 대입
		// int num = 200; // 중복선언
		// 이미 만들어진 변수를 사용할 땐 자료형 없이 변수명으로만 사용
		//300 = num // 저장소가 왼쪽, 값이 오른쪽
		// 변수가 = 왼쪽에 올 때만 저장 역할. 그외에는 저장하고있는 값으로 사용
		
		int num2;
		num1 = 10;
		num2 = 20;
		
		num1 = num2; // num1 = 10
		num2 = num2; // num2와 num2가 같다x -> num2 = 20
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 명명규칙
		// 숫자로 시작x
		// 특수문자x
		// 공백x
		// 소문자로 시작.
		// 의미가 바뀔 때마다 대문자로 구분
		// 변수명을 a, b 의미없는 이름으로 짓지 않는다.
		// int age = 20;
		
//		int num3;
//		num3 = 30;
		
		int num3 = 30; // 한줄로 표현하기
//		String str1 = "hello";
		double dnum = 3.14;
		
		
	}
}
	