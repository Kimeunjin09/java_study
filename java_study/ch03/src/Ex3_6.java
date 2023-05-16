public class Ex3_6 {

	public static void main(String[] args) {
		// Math.round()
		// 실수를 소수점 첫째자리에서 반올림한 정수를 반환
		// Math 수학과 관련된 메소드를 가지고있는 클래스
		long result = Math.round(4.52); // 5
				
		// 원하는 자리에서 반올림하려면 10의 n제곱으로 곱해서 반올림한뒤 다시 나눠야함
		// 예제 
		double pi =3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // 네번째인 5에서 반올림하고싶다
				
		// 풀어보자면
		// Math.round(pi * 1000) / 1000.0 --> pi == 3141.592
		// Math.round(3141.592) / 1000.0 --> Math.round()는 첫째자리에서 반올림하니까
		// 3142 / 1000.0 == 3.142
		// 만약 1000.0이 아니라 1000으로 나누면 int / int니까 3이 결과값
				
		// 3.141을 얻으려면? 반올림이 아니라 잘라내려면?
		System.out.println((int)(pi*1000)); // 3141
		System.out.println((int)(pi*1000) / 1000.0);
				
				
		// 나머지 연산자 ( % ) : 오른쪽 피연산자로 나누고 남은 나머지를 반환
		//				  나누는 피연산자는 0이아닌 정수만 허용(부호는 무시됨)
		// 10/8 = 1, 10%8 = 2 -> 몫은1 나머지는2
	}

}
