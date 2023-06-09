
public class PrintfEx1 {

	public static void main(String[] args) {
		// println() : 출력형식 지정 불가
		
		// 실수의 자리수 조절불가
		System.out.println(10/3); // 3
		System.out.println(10.0/3); // 3.3333333333333335
		
		// 10진수로만 출력됨
		System.out.println(0x1A); // 26 == 10진수
		
		// --> printf()로 출력형식 지정가능, 지시자사용(%d, %f 등등)
		// 8진수, 16진수에 접두사도 같이 출력되게 하려면 % 뒤에 #을 붙이면됨
		
		// printf() : 정수를 10,8,6진수로 출력
		System.out.printf("%d\n", 15); // 15, 10진수
		System.out.printf("%o\n", 15); // 17, 8진수
		System.out.printf("%#x%n", 15); // f, 16진수
		
		System.out.printf("%s", Integer.toBinaryString(15)); // 1111
		// 숫자 15를 이진문자열로 출력
		
		float f = 123.456789f;
		System.out.printf("%f\n", f); //123.456787
		System.out.printf("%e\n", f); // 지수형태출력
		System.out.printf("%g\n", f);
		
		double d = 123.456789;
		System.out.printf("%f\n", d); // 123.456789, double이 더 정확
		
		// 정수출력
		// %b : boolean 형식으로 출력
		// %d : 10진 정수의 형시으로 출력
		// %o : 8진 정수의 형식으로 출력
		// %x, %X : 16진 정수의 형식으로 출력
		
		// 실수출력
		// %f : 부동 소수점의 형식으로 출력
		// %e, %E : 지수 표현식의 형식으로 출력
		// %g : f와 e중 실수를 더 간단하게 나타내는걸 선택해서 출력
		
		// 문자, 문자열 출력
		// %c : 문자로 출력 character
		// %s : 문자열로 출력 string
		
		// 그 외는 JavaAPI의 Formatter에서 찾아보기
		
		// \n 개행문자로 줄바꿈을 해줌 printf는 줄바꿈을 해주지 않아서 개행문자 사용
		// %n os상관없이 줄바꿈
		
		
		
		
		// 지시자 앞에 숫자를 붙이면 값이 출력되는 자릿수 조절 가능
		// 지시자앞에 -를 붙이면 왼쪽 정렬, 0을 붙이면 공백을 0으로 채움
		// ex) %5d / %-5d / %05d
		
		// d=%14.10f, d  ==  전체 14자리 중 소수점 아래 10자리 출력
		// 정수 앞에는 빈자리를 공백으로 채우고 소수점 아래는 0으로채움
		
		// 문자열의 경우는 지시자 s 사용, 빈칸 공백채움
		// 지시자 앞에 .을 사용하면 부분출력이 가능 ex) %.8s == 8글자만 출력해라
		
		System.out.printf("[%5d]\n", 10);
		System.out.printf("[%-5d]\n", 10);
		System.out.printf("[%05d]\n", 10);
		// 지정된 자리수보다 출력할 값이 크면 지정한 자리수와 상관없이 값을 모두 출력
		
		double d2 = 1.23456789;
		System.out.printf("%14.6f", d2); //14자리에 소수점 6까지 출력
		
		System.out.printf("[%s}\n", "www.codechobo.com");
		System.out.printf("[%20s}\n", "www.codechobo.com");
		System.out.printf("[%-20s}\n", "www.codechobo.com");
		System.out.printf("[%.10s}\n", "www.codechobo.com");
		
	}

}
