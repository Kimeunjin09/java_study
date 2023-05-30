public class Ex6_3 { // 소스파일의 이름은 public class 이름과 일치
	public static void main(String[] args) {
		
		// 하나의 소스파일에 여러 클래스 작성
		// public class 가 있는 경우 소스파일의 이름은 반드시 public class의 이름과 일치해야함.
		// public class 가 하나도 없는 경우 소스파일의 이름은 여러개중 하나만 일치하면 가능.
		
		// 하나의 소스파일에 둘 이상의 public class가 존재하면 안됨.
		// -> 각 클래스를 별도의 소스파일에 나눠서 저장하던가 둘 중의 한클래스에 public을 붙이지 않아야함
		
		// 소스파일의 이름은 public class의 이름과 일치해야함. 이 때 대소문자까지 일치해야한다.
		
		// 실습
		class Ex6_4 {} // 이름이 다르기 때문에 아무문제가 없음
		// 하지만 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직
		
		// public class Ex6_4 는 불가 하나의 소스파일에는 하나의 public class 만 허용
		
		// class Ex6_3 , class Ex6_4, class Ex6_5
		// -> public class가 없는 경우에는 세개의 클래스중 어떤걸로 소스파일의 이름을 해도 상관없음
		//    셋중에 아무거나하고만 일치하면 됨
		
		// 대소문자가 일치하지 않는경우 화면에서는 오류가 안나지만 실행시켰을때 이클립스가
		// 실행할 클래스를 찾지 못해서 그 안에 메인메소드를 자동으로 호출하지 못해 이상한게 실행됨.
		// -> 소스파일과 메인메서드가public static void main(String[] args) 들어있는 클래스의 이름은 일치해야함!
		
		// 이클립스한테 직접 실행할 클래스를 지정핼수도 있음 실행 버튼 옆 작은 화살표 또는 run메뉴 밑에,
		// Run Configurations  또는 화면에서 우클릭 Run as - Run Configurations 에서
		// Main 클릭 후  Main class 안의 칸에 클래스를 수동으로 지정해줌
		
		
		
		
		
		
		
		
		
	}
}
