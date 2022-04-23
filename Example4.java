
public class Example4 {

	public static void main(String[] args) {
		//
	    // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
		
//		int[] numArr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; //정수배열
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
		
		// 학생 성적 관리
		
		// 학생 이름
		String[] names = {"철수", "영희", "민철", "수빈", "길동"};
		
		// 학생 성적
		int[] scores = {100, 90, 80, 92, 60};
		
		// 학생들의 점수 총합
		double sum = 0;
		for(int i = 0; i < 5; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		
		// 1까지의 합
		// 0 + 1
		
		// 조건 : 직접 계산하지 말기
		// 1. 학생들의 점수 평균
		
		// 실수와 정수는 계산되지 않음
		// 정수는 정수끼리, 실수는 실수끼리.
	
		double avg = sum/names.length;
		System.out.println(avg);
		
		// 2. 평균 이상인 학생 출력
		for(int i = 0; i < scores.length; i++) 
			if (scores[i] > avg) {
				System.out.println(names[i]);
			}
		
		// 3. 점수가 가장 높은 학생 출력
		
		// 4. 점수가 가장 낮은 학생 출력
		
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
