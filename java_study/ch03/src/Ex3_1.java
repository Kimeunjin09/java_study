
public class Ex3_1 {

	public static void main(String[] args) {
		
		// 연산자 : 연산을 수행하는 기호, 모든 연산자는 연산결과를 반환한다.
		// 피연산자 : 연산자의 연산 수행 대상
		
		// 산술연산자, 비교연산자, 논리연산자, 대입연산자, 기타(형변환, 삼항(?:), instanceof)
		
		// 우선순위
		// 단항(피연산자1개) > 산술 > 비교 > 논리 > 삼항 > 대입
		
		// 연산자의 결합규칙
		// 우선순위가 같은경우 왼쪽 -> 오른쪽 (대입, 단항 제외 / 오른쪾 -> 왼쪽)
		
		// 연산자의 우선순위와 결합법칙 정리
		// 1. 산술 > 비교 > 논리 > 대입 - 대입은 제일 마지막에 수행된다.
		// 2. 단항 > 이항 > 삼항 - 단항 연산자의 우선순위가 이항 연산자보다 높다.
		// 3. 단항 연산자와 대입 연산자를 제외한 모은 연산의 진행방향은 왼쪽에서 오른쪽이다.
		
		// 증감연산자
		
		// 증가 연산자 ++
		// 전위형 ++i; - 값이 먼저 증가(값이 참조되기전에)
		// 후위형 i++; - 값이 나중에 증가(값이 참조된후에)
		
		// ex) j = ++i; --> ==  ++i;  -->  j=i; 전위형
		//     j = i++; --> ==  j=i;  -->  i++; 후위형
		
		// -> 증감연산자가 독립적으로 사용될때는 전위형 후위형의 차이가 없음.
		
		// 부호연산자 (-, +)
		// 단항연산자임임
		// - 는 피연산자의 부호를 반대로 변경, +는 실제로 사용 X
	}

}
