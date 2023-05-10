import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		
		// 조건문 : 조건을 만족할때만 {}를 수행(0~1번 실행) / if문, switch문
		// 실행될수도 있고 안될수도있음
		
		// 반복문 : 조건을 만족하는 동안 {}를 수행(0~n번) / for문, while문
		// 반복문은 한번도 실행이 안될수도 있고 여러번 실행될수도 있음
		
		// 조건문과 반복문은 프로그램 실행흐름을 바꾼다해서 제어문이라함.
		
		
		
		// if문 : 조건식이 참일때, 블럭{}안의 문장들을 수행한다.
		// 블럭 안의 문장이 하나일 경우 블럭을 생략할수있음
		// 간단한 if문일 경우를 제외하고 되도록 {}생략하지 않기!
		
		// 블럭 { } : 여러 문장을 하나로 묶어주는 것
		// 코드의 가독성을 높이기 위해 {}안의 문장들은 tap으로 들여쓰기 하는게 좋음
		
		// if-else 문 : 둘중의 하나 - 조건식이 참일때와 거짓일때로 나눠서 처리
		// 참일 때는 if블럭 실행 거짓일때는 else 블럭 실행
		
		// --------------------------------------------------------
		
		
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
		
		
		// -------------------------------------------------------
		
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
		
		
		// -------------------------------------------------------
		
		
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
		
		// -------------------------------------------------------
		
		// 반복문
	
		// for문 : 조건을 만족하는 동안 블럭{}을 반복, 반복횟수를 알 때 적합
				
		for(int i = 1; i <= 5; i++) { // 1부터 5까지 1씩증가
		// 초기화(1번);  조건식(2번);  증감식(4번)
			
			// 수행될문장(3번) 조건식이 참일때
			
			// 1번은 한번만실행하고 2,3,4번의 반복(조건식이 거짓일때까지)
			
			// 초기화, 조건식, 증감식은 다 생략이 가능함 (;는 생략 불가)
			// == (; true ;)상태와 같음 조건식이 항상 true
			// == 조건식을 생략하면, true로 간주되어서 무한반복문이 됨
			
		}
		 
		// 예제
		for(int i = 1; i <=3; i++) { // 1부터 3까지 1씩 증가 == {}안의문장을 3번반복
			System.out.println("Hello");
		}
		
		// 2씩 증가로 바꾸고 싶으면 i=i+2, 두배씩은 i=i*2
		// 10부터 1까지 int i = 10; i >= 1; i--
		
		// int i = 1, j = 10; i <= 10; i++, j-- 이런식으로 두개씩쓸수도 있음
		// 대신 i와 j는 같은 타입이어야함
		// 또한 for문 안에 선언되어있기 때문에 for문 안에서만 사용가능
		for(int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i=" + i + ",j=" + j);
		}
		
		// System.out.println(i); 블가!
		// 사용하기 위해서는 i를 밖에 선언
		
		// ---> 이런식으로
		
		int i; // 번수 i의 scope(범위)가 늘어나게됨
		// scope(범위) : 선언위치부터 선언된 블럭의 끝까지 유효함
		// 범위는 좁을수록 좋음! 변수의 범위가 넓을수록 변수의 값이 잘못되었을때 확인해야하는 범위가 넓어지기 때문
		
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		// 예제
		
		int sum = 0;
		
		for(i = 1; i <= 5; i++) {
			sum += 1; // sum = sum + 1;
			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum );
		}
		
		// -------------------------------------------------------
		
		// 중첩 for문 : for문 내에 또다른 for문을 포함시킬수있다.
		
		// 예제(구구단)
		for(i = 2; i <= 9; i++ ) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		
		// 예제 별찍기 (10행 5열)
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		
		for(i = 1; i <= 5; i++) {
			System.out.println("**********");
		}
		
		// System.out.println("**********");을 변경하면
		for(i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			
			System.out.println(); // *을 10개찍고 줄바꿈
			
		}
		
		// *이 열마다 하나씩 늘어나게 하고 싶을때(상수인 j의 값을 i로 변경
		for(i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		// -------------------------------------------------------
		
		
		// while문 : 조건을 만족시키는 동안 블럭{}을 반복, 반복횟수 모를 때
		// while(조건식) { // 조건식의 연산결과가 true인 동안 반복될문장을 적는다.}
		
		// for문도 while문의 변형이다가 무슨소리?
		// if문과 switch문은 서로 못바꿀때도 있는데 for,while문은 100퍼 서로바꾸는게 가능
		
		// for문
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		// while문
//		int i = 1 ; 초기화
//		
//		while(i <= 10) { 조건식
//			System.out.println(i);
//		
//			i++; 증감식
//		}
		
		// 예제
		
		int i2 = 5;
		
		while(i2-- != 0) {
			// 조건식이 i != 0 이라면
			// i--; 가 있어야함
			System.out.println(i2 + " - I can do  it.");
		}
		
		// 예제2
		
		int sum2 = 0;
		int i3 = 0;
		
		// i3를 1씩 증가시켜 sum에 계속 더해나간다.
		while(sum <= 100) {
			System.out.printf("%d - %d%n", i3, sum);
			sum += ++i3; // sum = sum + ++i3;
		}
	
		// -------------------------------------------------------
		
		
		
		
		
	}

}
