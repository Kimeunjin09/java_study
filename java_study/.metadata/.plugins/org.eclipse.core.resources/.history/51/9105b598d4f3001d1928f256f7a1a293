import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		
		// 3. 섞기(shuffle) : 배열의 요소의 순서를 반복해서 바꾼다.(숫자섞기, 로또번호 생성)
		
		// 예제
		int [] numArr = {0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < 100; i++) { // 100번 두요소의 값 바꾸기
			int n = (int)(Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.(배열범위랑 맞춘거)
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp; // numArr[0]과 numArr[n]의 값을 서로 바꾼다.
			
			// 여기에 프린트문을 찍으면 바뀌는 과정을 볼 수 있음
			// 조건을 numArr.length로 바꾸고 numArr[0]을 numArr[i]로 바꿔도 잘 섞임
			// 예제는 맨앞에거하고만 바뀌는거고(비효율적)
		    // 변경한건 자리 순서대로 0~9순서대로 0번자리랑 임의의자리 1번자리랑 임의의자리..이런식	
		}
		
		System.out.println(Arrays.toString(numArr));
		
		
		// 예제2 로또번호 구하기
		int[] ball = new int[45]; // 0~44
		
		for(int i = 0; i < ball.length; i++)
			ball[i] = i + 1;
		
		System.out.println(Arrays.toString(ball)); // 확인용
			
			int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
			int j = 0; // 임의의 값을 얻어서 저장할 변수
			
			for(int i = 0; i < 6; i++) { // 0~5번째 인덱스만 값을 바꾸는것
				j = (int)(Math.random() * 45);
				tmp = ball[i];
				ball[i] = ball[j];
				ball[j] = tmp;	
				
				System.out.println(Arrays.toString(ball)); // 확인용
			}
			
			for(int i = 0; i < 6; i++) {
				System.out.printf("ball[%d]=%d%n", i, ball[i]);
			}
		
	}

}
