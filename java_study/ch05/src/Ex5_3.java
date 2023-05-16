import java.util.Arrays;

public class Ex5_3 {

	public static void main(String[] args) {
		
		// 배열의 출력
		// int[] iArr = {100, 95, 80, 70, 60}; 의 값을 다 출력하려면?
		
		// 배열을 가리키는 참조변수 iArr의 값을 출력한다.
		// System.out.println(iArr); // [I@768debd
		// -> [ == 배열, I == Integer타입, @는위치 그뒤는 주소값(어떤 주소에있는 int배열임)
		// 배열이름으로는 출력 불가! -> 예외 ==  char배열(저장된 문자들을 출력해줌)
		
		// 배열의 모든 요소 출력 == for문 사용
//		for(int i = 0; i < iArr.length; i++) { 배열의 요소를 순서대로 하나씩 출력
//			System.out.println(iArr[i]);
//		}
		
		// [Arrays.toString]
		// 더 편한 방법! Arrays.toString(배열이름), 배열의 내용을 문자열로 바꿔줌
		// Arrays클래스 사용 (배열을 다루는데 필요한 메서드 제공)
		// 배열 iArr의 모든 요소를 출력한다.
		// System.out.println(Arrays.toString(iArr));
		
		// 실습
		int[] iArr = {100, 95, 80, 70, 60};
		
		for(int i = 0; i < iArr.length; i++) { 
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
		
		// 예제
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60}; 이것도 가능~
		int[] iArr3 = {100, 95, 80, 70, 60};
		char[] chArr = {'a', 'b', 'c', 'd'};
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[1] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다
		}
		
		 for(int i = 0; i < iArr2.length; i++) {
			 iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
		 }
		 
		 // 배열에 저장된 값들을 출력한다.
		 for(int i = 0; i < iArr1.length; i++) {
			 System.out.printf(iArr1[i] + ",");
		 }
		 
		 System.out.println();
		 
		 System.out.println(Arrays.toString(iArr2));
		 System.out.println(Arrays.toString(iArr3));
		 System.out.println(Arrays.toString(chArr));
		 System.out.println(iArr3);
		 System.out.println(chArr);
	}

}
