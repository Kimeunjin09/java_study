import java.util.Arrays;

public class Ex5_11 {

	public static void main(String[] args) {
		
		// Arrays(클래스)로 배열 다루기
		
		// 배열의 비교와 출력 - equals(), toString()
		
		// toString : 배열에 저장된 내용을 문자열로 바꿔줌
		// 2차원, 다차원 배열일떄는 deepToString()을 사용!
		// ex) int[] arr = {0,1,2,3,4}
		// Arrays.toString(arr) == [0,1,2,3,4]
		
		// equals() : 요소를 비교해 같으면 true반환 아니면 false 반환
		// 마찬가지로 2차원, 다차원배열에서는 deepEquals를 사용
		
		
		// 배열의 복사 - copyOf(), copyOfRange() 
		// 배열을 복사할때 for문이나 다른방법을 이용해도 되지만 편리성을 위해!
		
		// Arrays.copyOf(배열이름, 복사할요소의 갯수)
		// ex) int[] arr = {0,1,2,3,4}
		//     int[] arr2 = Arrays.copyOf(arr, arr.length);
		//     -> 배열 arr 요소 5개를 복사하겠다 == 똑같이 복사
		//        만약 3을 적는다면 0,1,2만 복사
		// 만약 원래 배열보다 큰값을 복사하면 0이들어감
		
		// copyOfRange(배열, 복사시작인덱스번호, 끝날인덱스번호);
		// 어디서부터 어디까지 복사하겠다.
		// ex) int[] arr = {0,1,2,3,4}
		//     int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		//     -> arr5 = [2,3] / 4는 불포함!
		// 마찬가지로 배열의 길이를 벗어나면 나머지는 0으로 들어옴
		
		
		// 배열의 정렬 - sort() : 오름차순 정렬
		// ex) int[] arr = {3,2,0,1,4}
		//     Arrays.sort(arr); == [0,1,2,3,4]
		
		// 실습
		
		// 배열의 비교와 출력
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12}, {21,22}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		
		String[][] str2D = {{"aaa", "bbb"},{"AAA", "BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"},{"AAA", "BBB"}};
		
		System.out.println(str2D==str2D2); //false, 참조변수 값을 비교함
		// 따라서 두 배열은 같은 메모리값을 가질수 없기 때문에 false
		
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //2차원 배열이니까 deepEquals사용
		
		// 배열의 복사
		int[] arr2 = Arrays.copyOf(arr, arr.length); //arr전체를 복사해 arr2를 만들겠다
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr3));
		
		// 배열 정렬
		int[] arr4 = {3,4,1,0,2};
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
