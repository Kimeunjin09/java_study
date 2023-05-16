import java.util.Arrays;

public class Ex5_6 {

	public static void main(String[] args) {
		
		// String배열의 선언과 생성
		
		// String[] name = new String[3]; // 3개의 문자열을 담을 수 있는 배열을 생성
		// String은 기본형이 아니고 참조형이라 기본값이 null!
		// 문자열이 만들어지고 그 주소가 저장공간에 들어오는 식임
		
		// String 배열에 저장방법
		// 1. name[0] = "Kim"; name[1]="Park"; name[2]="Yi"
		// 2. String[] name = new String[] {"Kim", "Park", "Yi"};
		// 3. String[] name = {"Kim", "Park", "Yi"};
		
		
		// 실습
		// index : 0~3-1 == 0~2
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i = 0; i < 10; i++) {
			int tmp = (int)(Math.random() * 3);
			System.out.println(strArr[tmp]); 
			
			//System.out.println((int)Math.random() * 3); // 0~2
			
			
		}
		
		
	}

}
