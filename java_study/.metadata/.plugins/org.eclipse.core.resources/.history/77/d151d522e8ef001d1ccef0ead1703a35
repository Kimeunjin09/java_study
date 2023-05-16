public class Ex4_6 {

	public static void main(String[] args) {
		
		// 중첩 for문 : for문 내에 또다른 for문을 포함시킬수있다.
		
		// 예제(구구단)

				
		for( int i = 2; i <= 9; i++ ) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
				
		// 예제 별찍기 (10행 5열)
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
				
		for(int i = 1; i <= 5; i++) {
			System.out.println("**********");
		}
				
		// System.out.println("**********");을 변경하면
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
					
			System.out.println(); // *을 10개찍고 줄바꿈
					
		}
				
		// *이 열마다 하나씩 늘어나게 하고 싶을때(상수인 j의 값을 i로 변경
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
					
			System.out.println();
					
		}
	}

}
