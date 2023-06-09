
public class VarEx2 {

	public static void main(String[] args) {

		// 상수 : 한번만 값을 저장 가능한 변수, final
		
		// 리터럴 : 그 자체로 값을 의미하는 것
		// 리터럴의 접두사와 접미사
		// 접미사 : 정수형L, 실수형f/d d는 생략가능 // 실수형 리터럴에 접미사가 없으면 d 생략된거임
		// '' 문자형, "" 문자열 , ''안에는 두개이상의 문자x
		// ""안에는 빈 문자열이 가능하지만 ''은 비면 오류
		// byte타입 변수에 저장할수 있는 값의 범위 -128~127, byte는 따로 리터럴이 없기 때문에 integer사용
		// 기호e는 10의 n제곱을 의미함
		// 기호e 혹은 .이 포함되어있다면 실수형! .10 == 0.10
		
		int score = 100;
		score = 200;
		
		System.out.println(score);
		
		final int score2 = 100;
		// score2 = 200; 에러! 상수라서 값을 변경할 수 없다
		
		// 변수와 리터럴의 타입이 달라도 되는 경우
		//변수의 저장범위가 리터럴보다 클 때, byte/short변수에 int리터럴 저장가능
		// byte, short타입의 리터럴이 없기 때문(대신 변수 탑입의 범위 이내여야한다!)
		// int의 범위 == +-20억
		
		boolean power = true;
		
		byte b = 127;
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 접두사0x가 있으니까 16진수, 10진수로 16
		
		long l = 10_000_000_000L; // 인티저의 최대값은 20억
		
		float f = 3.14f;
		double d = 3.14;
		
		
		System.out.println(power);
		
		System.out.println(10.0); // 10.0
		System.out.println(0.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0
		
		char ch = 'A';
		int i = 'A'; // 65
		
		String str = ""; // 빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		
		System.out.println(""+7+7); // 77
		System.out.println(7+7+""); // 14
		
		
		// 두 변수 값 바꾸기
		int x = 4, y = 2;
		int tmp;
		
		tmp = x; // 1. x의 값을 저장
		x = y; // 2. x에 y값 저장
		y = tmp; // 3. tmp에 y값 저장
		
		
		
	}

}
