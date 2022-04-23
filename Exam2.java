
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열= 순서를 정하는것
		
		int[] numArr = {10, 20, 30, 40, 50}; //정수배열
		
		// 배열의 경계값은 항상 주의
		// 시작 ->
		// 끝 -> 배열의 개수 -1
		System.out.println(numArr[4]); // 배열은 순서가 0부터 시작.
		
		//타ㅣ입이 같아야함.
//		String[] StringArr = {"aa", "bb", "cc", 10}; //안됨
//		System.out.println(StringArr[4]); // 배열은 순서가 0부터 시작.
		
		//배열의 핵심 요소 두가지 -> 자료형(타입), 길이
		
		// 사용자입력, 파일 데이터, 데이터베이스 데이터 등등 여러분이 직ㅇ접 입력하는 것이 아닌 외부데이터를 많이 불러올 때 사용
		
		int[] intArr = new int[100];  // 배열을 만드는 일반적인 방법
		System.out.println(intArr[99]);
		
		// 1. 숫자 배열은 0으로 초기화
		// 2. 그외 배열은 null로 초기화.
		// null -> 데이터가 없음을 명시적으로 표현. System.out.println();
		
		String[] strArr = new String[10];
		System.out.println(strArr[0]);
		
		// 수정
		strArr[0] = "hello";
		String str1 = strArr[0];
		System.out.println(str1);
		
		strArr[1] = "byebye";
		strArr[2] = "hahaha";
		
		// 일괄 조회 -> 배열 거의 반드시 반복문이랑 같이 사용됨.
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		// 배열은 길이 정보를 제공.
		System.out.println(strArr.length);
		System.out.println(intArr.length);
		
		// 배열 전체 조회
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		
		
		
		// 삼각형 그리기
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
