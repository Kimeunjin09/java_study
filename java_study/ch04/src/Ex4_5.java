public class Ex4_5 {

	public static void main (String args[]) {
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
		
	}
}