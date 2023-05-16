public class Ex3_7 {

	public static void main(String[] args) {
		// 비교연산자 ( > < >= <= == != )
		// 두 피연산자를 비교해서 true 또는 false를 반환
		// ex) 'A' > 'B' 의 경우 산술변환규칙에 의해 integer보다 작으므로 int로 변환됨
		//     따라서 65 > 66 이니까 false
				
		// 문자열 비교에는 == 대신 equals()를 사용해야 한다!
		// 대소문자를 구분 안하는 경우에는 equalsIgnoreCase 사용
				
		// 문자열을 만드는 1번방법
		// ex) String str1 = "abc";  / String str2 = "abc";
		//     str1==str2 / st1.equals(str2) -> 모두 true
				
		// 문자열을 만드는 2번 방법
		// 하지만 내용이 같은데도 String str1 = new String("abc");  / String str2 = new String("abc"); 이렇게 해주면
		// tr1==str2 -> false / st1.equals(str2) ->true
				
		// 문자열을 만드는 방법 2가지에 대한 차이는 9장, 2번방법은 6장에서 배울거임 
				
	}

}
