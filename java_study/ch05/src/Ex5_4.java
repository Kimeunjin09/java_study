public class Ex5_4 {

	public static void main(String[] args) {
		// 배열의 활용
		
		// 1. 총합과 평균 : 배열의 모든 요소를 더해서 총합과 평균을 구한다.
		
		// 예제
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
//		sum += score[0];
//		sum += score[1];
//		sum += score[2];
//		sum += score[3];
//		sum += score[4]; 를 간단히하면 밑에 for문!
		
		for(int i = 0; i <score.length; i++) {
			sum += score[i]; // 반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
		}
		average = sum / (float)score.length; // 계산결과를 float타입으로 형변환
		// 형변환 안해주면 int끼리의 계산이라 95.0이 나옴 
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
		
		
		// 2. 최대값과 최소값 : 배열의 요소 중에서 제일 큰 값과 제일 작은 값을 찾는다.
		// 예제
		int[] score2 = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score2[0]; // 배열 첫 번째 값으로 최대값을 초기화 한다.
		int min = score2[0];
		 
		for(int i = 1; i < score2.length; i++) {
			// 배열의 두번째 요소부터 읽기 위해서 변수 i의 값을 1로 초기화 했다.
			if(score2[i] > max) { // 배열의 두번 요소부터 읽기위해 변수i의 값을 1로 초기화
				max = score[i];
			}else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최대값 : " + min);
		
	}

}
