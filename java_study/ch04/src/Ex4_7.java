import java.util.Scanner;

public class Ex4_7 {
	
	public static void main(String args[]) {
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
				
		int i = 5;
				
		while(i-- != 0) {
			// 조건식이 i2 != 0 이라면
			// i2--; 가 있어야함
			System.out.println(i + " - I can do  it.");
		}
				
		// 예제2
				
		int sum= 0;
		int i2 = 0;
				
		// i3를 1씩 증가시켜 sum에 계속 더해나간다.
		while(sum <= 100) {
			System.out.printf("%d - %d%n", i2, sum);
			sum += ++i2; // sum = sum + ++i;
		}
				
		// 예제3
		int num = 0, sum2 = 0;
		System.out.print("숫자를 입력하세요.(예:12345)>" );
				
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		// 문자열"12345"를 -> 숫자 12345 로 바꿔줌
				
		while(num != 0) {
			// num을 10으로 나눈 나머지를 sum에 더함.
			// %10을 한다는건 마지막자리(나머지)를 얻겠다는것
			// ---> 10으로 나머지 연산을 하면 마지막 자리를 얻는다.
			// ex)12345%10 == 5
			sum2 += num%10; // sum2 = sum2 + num%10
			System.out.printf("sum2=%3d num=%d%n", sum2, num);
					
			num /= 10; // num = num / 10;
		}	
		System.out.println("각 자리수의 합:" + sum2);
		
		// 예제3을 for문으로 나타낸다면
		for(num = 12345; num > 0; num = num / 10) {
			// 여기까진 num= 12345, 1234, 123, 12, 1
			System.out.println(num%10); // 5, 4, 3, 2, 1
			sum2 += num%10;
		}
		System.out.println("각 자리수의 합:" + sum2);
		
		// 다시 while문
		while(num > 0) {
			sum2 += num%10;
			System.out.println("sum2=" +sum2 + ",num%10=" + num%10);
			num = num/10;
		}
		System.out.println("각 자리수의 합:" + sum2);
		
		
		// do-while문 : 블럭{}을 최소한 한 번 이상 반복, 사용자 입력받을 때 유용
		
	//		do {
	//			조건식의 연산결과가 참일때 수행될 문장들을 적는다.(처음 한번은 무조건 실행)
	//		} while(조건식); <- ;을 잊지않도록 주의!
		
		// 예제 (Math.random()이 생성한 숫자 맞추기)
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저정
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input != answer);
		
		System.out.println("정답입니다.");
		
		// while문으로 변경해보기
		System.out.print("1과 100사이의 정수를 입력하세요.>");
		input = sc.nextInt();
		
		while(input != answer) {
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
			
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();
			// 똑같은 코드가 두번 중복되므로 사용자의 입력을 받는게 필요한경우 dowhile이 적합
		}
		
		System.out.println("정답입니다.");
		
		
		
	}
}
