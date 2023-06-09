public class Ex3_5 {

	public static void main(String[] args) {
		// 사칙연산자 ( + - * / )
		// 컴퓨터는 같은 타입끼리만 결과할수있고 결과값의 타입도 같음
				
		// 산술변환 : 연산전에 피연산자의 타입을 일치시키는것
		// 규칙 1. 두 피연산자의 타입을 같게 일치시킨다 (보다 큰 타입으로 일치)
		// 규칙 2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환된다(byte, char, short)
				
		// '2' 문자 2에서 -0을 하면 유니코드에따라 50 - 48 이므로 2
		// 앞에서 문자를 숫자로 변환하려면 - 0 을 해야한다고 했던 이유이기도함.
				
		// 예제
		int a = 1_000_000; // 1백만 = 10의 6제곱
		int a2 = 2_000_000; // 2백만 = 10의 6제곱
				
		// 10의 12제곱 (int의 범위는 10의9제곱)
		long c = a * a2;
				
		System.out.println(c); // -1454759936 왜 음수...? == 오버플로우 발생
		// int * int라 값이 int로 나온거
		// 해결방법 : long c = (long)a $ a2; a나 a2를 형변환해줌
				
	}

}
