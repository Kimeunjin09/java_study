
public class VarEx1 {

	public static void main(String[] args) {
		
		// 변수 : 하나의 값을 저장할 수 있는 메모리 공간, 1byte단위
		// 메모리 주소는 길고복잡하기 때문에 특정메모리영역에 주소대신 이름을 이용해 메모리에 값을 저장하고 읽을 수 있게함 == 변수
		// 변수타입 변수이름; - 변수 선언
		// 변수이름 = 25; - 변수에 값 저장, 변수이름에 25라는 값이 저장됨
		// 변수타입 변수이름 = 0; - 변수의 초기화
		// 변수의 타입이 같은 경우 ,를 이용해 한줄에 여러변수 선언 가능
		// ex) int x = 0, y = 5;
		// 메모리는 여러프로그램이 함께 공유하는 자원이기 때문에 사용하기 전에 새로운값을 저장해 기존의 값을 지워줌 == 초기화
		
		// 클래스변수, 인스턴스변수, 지역변수
		// 지역변수는 자동초기화가 되지 않기 때문에 읽기전에 꼭 초기화해야함! (객체지향전까지 우리가 사용하는건 다 지역변수)
		
		int x = 4, y = 2;
		
		System.out.println(x+y); // 덧셈
		System.out.println(x-y); // 뺄셈
		System.out.println(x*y); // 곱셈
		System.out.println(x/y); // 나눗셈
		
		// 변수의 타입
		// 변수의 타입은 저장할 값의 타입에 의해 결정됨.
		// 저장할 값의 타입과 일치하는 타입으로 변수를 선언
		
		// 기본형 8가지(실제값을 저장)
		// 문자 char : 2byte유니코드
		// 정수 byte(1byte), short(2byte), int(4byte), long(8byte)
		// 실수 float(4byte), double(8byte)
		// 알파벳 E는 10의 몇제곱인지를 나타냄 ex) 1.4E-45 ~ 3.4E38 == 1.4*10의 -45제곱 ~ 3.4*10의38제곱
		// 정밀도(몇자리까지 오차없이 값을 저장할수있는지) : float = 7자리 / double = 15자리
		// 논리 boolean(true, false) : 1byte
		
		// 1bit = 2진수1자리(0,1), 1byte = 8bit
		
		// 각 타입의 최대값과 최소값 계산방법
		// n비트로 표현할 수 있는 값의 개수 : 2의n제곱 ex) 8bit == 2의8승이니까 256개
		// n비트로 표현할 수 있는 부호없는 정수(양수)의 범위 : 0~2의 n승 -1
		// n비트로 표현할 수 있는 부호있는 정수의범위 : -2의 n-1승 ~ 2의 n-1승 -1
		
		
		
		// 참조형(메모리 주소를 저장, 객체의 주소를 저장) : 기본형을 제외한 나머지 System, String 등..
	}

}
