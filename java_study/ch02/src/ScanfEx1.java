import java.util.Scanner;

public class ScanfEx1 {

	public static void main(String[] args) {
		
		// Scanner : 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
		// import필요
		// Scanner객체 생성! Scanner scanner = new Scanner (System.in);
		// (System.in) 화면에서 입력 받을거다.
				
		// nextLine() : 화면에서 입력받은 내용을 줄단위(한행)를 읽어 문자로 반환
		// Integer.parseInt(input) : 문자열input을 정수로 변환
		// 숫자 -> 문자열 = 숫자 + ""(빈문자열)
		// 문자 -> 숫자 = Integer.parseInt
				
		// 한라인에 여러가지 값을 입력받는경우 라인으로 읽어온후 값을 나눠서 처리할때 line사용
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println(num);
		System.out.println(num2);
		
		String input = scanner.nextLine();
		// line단위 입력경우는 값이 여러개 숫자, 문자열, 지수 섞여있을때 사용
		//int num3 = Integer.parseInt(input);
		// System.out.println(num3); 
		// 이건 int num = scanner.nextInt(); 이렇게 한문장 쓸수있는걸 두개로 나눠쓴거
		
		// -----------------------------------------------------
		// 정수형의 오버플로우
		
		// 오버플로우 : 표현범위를 벗어남
		
		
		// -----------------------------------------------------
		
		// 타입간의 변환방법
		String str = "3";
		// 1. 문자와 숫자간의 변환 : 문자'0' 을 더하거나 빼줌
		System.out.println('3' - '0' + 1); // 4
		// '3'문자 3을 문자'0'을 - 해주며 숫자 3으로 변환
		
		// 2. 문자열로의 변환 : 빈 문자열 ""을 더해줌
		
		// 3. 문자열을 숫자로 변환 : Integer.parseInt / Double.parseDouble
		System.out.println(Integer.parseInt("3") + 1); // 4
		
		// 4. 문자열을 문자로 변환 : "3" -> '3' == charAt(0)
		System.out.println(str.charAt(0) - '0'); // '3'
		// charAt(0)을 안해주면 문자0은 숫자로 48 따라서 3(숫자) + '0'(숫자로48) = 51
		
		// 1번 예시는 숫자3 4번예시는 문자3
	}

}
