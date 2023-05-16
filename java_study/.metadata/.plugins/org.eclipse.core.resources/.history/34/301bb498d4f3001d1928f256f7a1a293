public class Ex5_7 {
	
	public static void main(String[] args) {
		
		// String클래스
		
		// 1. String 클래스는 char[]와 메서드(기능)를 결합한것
		// String클래스 = char[] + 메서드(기능)
		// 문자열 == 여러개 문자의 나열(캐릭터배열char[]로 다룰수있음)
		// 자바에서는 캐릭터배열로 다루지만 자바에서는 String클래스로 다룸
		// 메서드(기능)은 문자열을 다루는데 필요함
		
		// 2. String 클래스는 내용을 변경할 수 없다.(read only)
		// ex) String a = "a"; String b ="b"; a = a + b;(문자열결합)
		// -> 기존의 문자열"a"가 문자열 "ab"로 바뀌는것처럼 보이겠지만
		// 새로운 문자열 "ab"의 저장공간이 만들어고 이 주소를 참조변수 a가 참조함.(9장)
		
		// String클래스의 주요 메서드
		// - char charAt(int index) : 문자열에서 해당위치(index)에 있는 문자를 반환한다.
		// ex) String str = "ABCED"; char ch = str.charAt(3); == 'D'
		
		// - int length() : 문자열의 길이를 반환한다.
		// ex) str.length() == 5
		
		// - String substring(int from, int to) : 문자열에서 해당범위(from~to)의 문자열을 반환한다.(to는 포함 안됨)
		// ex) String str = "012345"; String tmp = str.substring(1,4);
		//     tmp == 123
		
		// - boolean equals(Object obj) : 문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false
		
		// - char[] toCharArray() : 문자열을 문자배열(char[])로 변환해서 반환한다.
		// String -> char[]
		
		// 실습
		String str = "ABCDE";
		
		// C를 뽑으려면?
		char ch = str.charAt(2);
		
		// substring
		String str2 = str.substring(1,4); // BCD
		String str3 = str.substring(1); // to 부분을 생략하면 문자열 끝까지 나옴 == str.substring(1, str.length());
		// 길이까지면 1~5인데 5는 범위에 없으니 1~4 == BCDE
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
