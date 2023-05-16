public class Ex5_2 {

	public static void main(String[] args) {
		
		// 배열의 길이(int형 상수) : 배열이름.length
		// int[] arr = new int[5]; -> 길이가 5인 int배열
		// int tmp = arr.length; -> arr.length의 값은 5이고 tmp에 5가 저장됨
		
		// 배열은 한 번 생성하면(실행동안,하면) 그 길이를 바꿀 수 없다!
		
		// 왜 못바꾸냐?
		// 메모리공간에서 배열의 크기만큼 공간을 찾아 배열을 만듦, 근데 길이를 바꾸면
		// 사용공간이 연속적이라 뒤에 공간이 비어있다는 보장이 없음
		
		// 길이가 부족하면?
		// 그럼 다른곳으로 옮겨야 하는데 아예 크기를 못늘리게하고 필요하면 다른곳으로 옮기게 규칙이 정해져있음
		// -> 공간이 부족하면 크기를 늘릴수없기 때문에 새로운 배열을 만들고 기존 배열 내용을 복사 후 새로운걸 저장
		
		// int[5]라고 길이가 나와있는데 왜 .length를 쓰냐?
//		ex) int[]score = new int[6];
//		
//		for(int i = 0;  i < 6; i++) {
//			System.out.println(score[i]);
//		} -> 배열의 모든요소 출력
		
		// 위에서 선언한 변수의 길이를 5(0~4)로 바꿨는데 for문에서 안바꾸면
		// 여전히 0~5로 오류가 남, 배열의 인덱스 범위를 벗어났기 때문에
		// 따라서 i < 6이라는 조건보다는 i < score.length로 작성!!
		// --> 변경에 유리한 코드
		
		// 실습
		// index범위 : 0~4
		int[] arr = new int[5]; // 길이가 5인 int배열 arr생성
		System.out.println("arr.length=" + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + " ] = " + arr[i] );
		}
		
		
		// 배열의 초기화 : 배열의 각 요소에 처음으로 값을 저장하는 것
		// 배열은 기본적으로 자동초기화가 됨 int의 경우 기본값 0
		
		// 각 요소에 값을 직접 저장
//		int[] score = new int[5];
//		score[0] = 50;
//		score[1] = 60;
//		score[2] = 70;
//		score[3] = 80;
//		score[4] = 90;
		
		// 각각 저장하는건 번거로우니 반복문 이용
//		int[] score = new int[5];
//		
//		for(int i = 0; i < score.length; i++) {
//			score[i] = i * 10 + 50;
//		}
		
		// 근데 또 반복문에는 규칙이 필요하니까 더 간단한 방법이 있음
//		1번
//		int[] score = new int[] {50,60,70, 80, 90};
		
//		2번
//		int[] score = {50, 60, 70, 80, 90}; //new int[]를 생랼할 수 있음
		
		// 이때
		// int[] score;
		// score = {50, 60, 70, 80, 90}
		// 이렇게 선언과 초기화를 나눠쓰는건 오류발생! new int[]생략 불가
		
		// 가끔 선언과 초기화를 나눠써야 할때가 있는데 이때는 아래방법 사용
		// score = new int[]{50, 60, 70, 80, 90}; 이렇게 써야함!
		
	}

}
