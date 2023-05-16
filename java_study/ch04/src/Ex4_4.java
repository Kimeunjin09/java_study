public class Ex4_4 {
	
	public static void main (String args[]) {
		
		// 임의의 정수(난수) 만들기
		
		// Math.random() : 0.0과 1.0사이의 임의의 double값 반환
				
		// 0.0 <= Math.random() < 1.0
		// 1~3 사이의 정수를 얻고싶다면 각변에 3을 곱함
		// -> 0.0 <= Math.random() * 3 < 3.0
		// -> 각 변을 Int로 형변환함 -> 0 <= (int)(Math.random() * 3) < 3
		// -> 각 변에 1을 더한다 -> 1 <= (int)(Math.random() * 3) + 1 * 3 < 4
		// 곱하는 숫자는 원하는 개별값의 갯수
				
		// 예제
		int num = 0;

		// {}안의 내용을 20번 반복
		for(int i = 1; i <= 20; i++) {
			System.out.println(Math.random()); // 0.0 ~ 1.0 사이
		}
				
		// 1~10 사이의 난수를 20개 출력하시오 -> 개별값 갯수 10개
		for(int i = 1; i <= 20; i++) {
			// 원하는 개별값의 갯수 곱하기
			System.out.println(Math.random()*10); // 0.0<= x <10.0
					
			// 정수(int)로 형변환, 소수점 아래 잘라주기
			System.out.println((int)(Math.random()*10)); // 0 <= x <10 / 0~9
					
			// 덧셈뺄셈을 이용해 범위를 바꿔주기, 각 변에 1을 더함
			System.out.println((int)(Math.random()*10) + 1); // 1 <= x <11 / 1~10
					
		}
				
		// -5~5 사이의 난수를 20개 출력하시오 -> 개별값 갯수 11개
				for(int i = 1; i <= 20; i++) {
					// 원하는 개별값의 갯수 곱하기
					System.out.println(Math.random()*11);
							
					// 정수(int)로 형변환, 소수점 아래 잘라주기
					System.out.println((int)(Math.random()*11));
							
					// 덧셈뺄셈을 이용해 범위를 바꿔주기, -5하기
					System.out.println((int)(Math.random()*11) - 5);
					// -5 <= x < 6, -5~5
		}
	}

}
