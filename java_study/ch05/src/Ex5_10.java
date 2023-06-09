import java.util.Scanner;

public class Ex5_10 {

	public static void main(String[] args) {
		
		// 예제1
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
				
				// score.length == 4, score[i].length == 3
			}	
		}
		System.out.println("sum = " + sum);
		
		// 예제2
		int[][] score2 = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==========================");
		
		for(int i = 0; i < score2.length; i++) {
			int sum2 = 0; // 개인별 총점
			float avg = 0.0f; // 개인별 평균
			
			korTotal += score2[i][0];
			engTotal += score2[i][1];
			mathTotal += score2[i][2];
			System.out.printf("%3d", i + 1); // 번호 출력
			
			for(int j = 0; j < score2[i].length; j++) {
				sum2 += score2[i][j];
				System.out.printf("%5d", score[i][j]);
				
				avg = sum2 / (float)score2[i].length;
				System.out.printf("%5d %5.1f%n", sum2, avg);
			}
			
			System.out.println("===================================");
			System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
		}
		
		// 예제3
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
				};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
			
			String tmp = scanner.nextLine(); // 위에서 입력한 값을 받음
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n"); // %n은 printf에서만 줄바꿈으로 쓰임
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
				// %s는 문자열출력 지시자
			}
		}
		
		
		
		
		
	}
	
}
