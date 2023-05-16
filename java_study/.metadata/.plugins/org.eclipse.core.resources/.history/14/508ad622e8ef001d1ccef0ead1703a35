import java.util.Scanner;

public class Ex4_2 {

	public static void main(String args[]) {
		
		// if-else if 문 : 여러개중의 하나 - 여러개의 조건식을 포함한 조건식
		// if(조건식) {} else if(조건식2) {} else if(조건식3) {} else
		// else 블럭은 생략이 가능함, 위의 어느 조건식도 만족하지 않을 때 수행될 문장을 적음
				
		// 예제
		int score = 0;
		char grade = ' ';
				
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
				
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
					grade  = 'B';
		} else if(score >= 70) {
					grade = 'C';
		}else {
					grade = 'D';
		}
				
				System.out.println("당신의 학점은" + grade + "입니다.");
				
		// 리팩토링 중에 else 블럭은 쓰지말아라 라는게 있음
		// 위에 코드를 예시로 들면 grade라는 변수를 D로 설정해놓았으면 else구문이 필요없음
				
				
		// 중첩 if 문 : if 문 안의 if
//		if(조건식1) {
//			if(조건식2) {
//					조건식1과 조건식2가 모두 true일 때 수행될 문장
//						
//			} else {
//				조건식1이 true이고, 조건식2가 false일때 수행되는 문장
//			}
//		} else {
//			조건식 1이 false일 때 수행되는 문장
//		}
				
		// else블럭은 여러개의 if문중 가까운 if문과 연결되기 때문에 {}이 중요!
				
		// 예제
		int score2= 0;
		char grade2 = ' ', opt = '0';
				
		System.out.print("정수를 입력하세요 : ");
		score2 = sc.nextInt();
				
		System.out.printf("당신의 점수는 %d 입니다.%\n", score2);
				
		if(score >= 90) { // score가 90점 보다 같거나 크면 A
			grade = 'A';
			if (score >= 98) { // 90점 이상 중에서도 98점이 상은 A+
				opt = '+';
			} else if(score < 94) { // 90점 이상 94점 미만은 A-
						opt = '-';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은%c%c입니다.%n", grade, opt);
				
	}
}
