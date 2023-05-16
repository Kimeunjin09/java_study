import java.util.Scanner;

public class Ex4_3 {

	public static void main(String[] args) {
		
		// switch문 : 처리해야 하는 경우의 수가 많을 때 유용한 조건문
		// break문이 없으면 break문을 만날때까지 switch문 블럭을 끝까지 다 무시하고 빠져나옴
				
//		switch(조건식) {
//			case 값1 : 조건식의 결과가 값1과 같을 경우 수행될 문장들
//					
//				break;
//					
//			case 값2 : 조건식의 결과가 값2과 같을 경우 수행될 문장들
//					
//				break; // switch문을 벗어난다
//					
//			default;
			// 조건식의 결과가 일치하는 case문이 없을 때 수행될 문장들
//		}
				
		// default문은 생략갸능 하며 보통 switch문의 맨끝에 쓰이기 때문에 break안써도 됨.
				
		// 실행과정 정리
		// 1. 조건식을 계산한다.
		// 2. 조건식의 결과와 일치하는 case문으로 이동한다
		// 3. 이후의 문장들을 수행한다
		// 4. break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다.
				
		// if문과 switch문의 차이
				
		// if의 조건식으 true. flase라면 switch문의 조건식은 정수, 문자열이 온다
		// if문은 조건식이 여러개 switch는 조건식이 하나
		// switch문은 항상 if문으로 바꿀수있지만 if문은 switch문으로 바꿀수없는 경우도 있음
				
				
		// switch문의 제약조건
		// 1. switch문의 조건식 결과는 정수 또는 문자열이어야 한다.
		// 2. case문의 값은 정수, 상수(문자포함), 문자열만 가능하며 중복되지 않아야 한다.
		// 상수가 된다 == 변수 안된다
				
		// 예제
		System.out.print("현재 월을 입력하세요 : ");
				
		Scanner sc = new Scanner(System.in);
		int month  = sc.nextInt();
				
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재 게절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재 게절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 게절은 가을입니다.");
				break;
					
			default:
				System.out.println("현재 게절은 겨울입니다.");
					
		}
				
		// 4를 입력하면 break를 만날때까지 내려가서 현재 계절은 봄입니다 출력
		// 첫번째 break를 지우고 4를입력할경우 봄 + 여름 출력
				
	}

}
