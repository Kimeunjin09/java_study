public class Ex6_4 {

	public static void main(String[] args) {
		
		// 객체의 생성과 사용
		
		// 1. 객체의 생성
		// 클래스명 변수명; -> 클래스의 객체를 참조하기 위한 참조변수를 선언
		// 변수명 = new 클래스명(); -> 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장
		
		// Tv t; -> Tv클래스 타입(참조형)의 참조변수 t를 선언
		// t = new Tv(); -> Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
		// 리모콘과 객체를 연결
		
		// t는 리모콘이라 생각하면됨(객체를 다룸)
		// 하나로 합치면 Tv t = new Tv();
		// -> 새로운 tv를 하나 만들어 리모콘과 연결해줌
		
		// 알아둘것
		// --> 객체를 다루기 위해서는 잠조변수가 필요하며, 객체를 생성한 뒤 대입연산자로 참조변수와 생성한 객체를 연결해줘야함!
		
		// 2. 객체의 사용 == 객체가 가지고 있는 변수와 메서드를 사용
		// 변수사용방법
		// t.channel = 7; -> Tv인스턴스의 멤버변수 channel값을 7로 한다.
		// 메서드 사용(호출)방법
		// t.channelDown(); -> Tv인스턴스의 메서드 channelDown()을 호출한다.
		
		// 클래스 작성(설계도) -> 객체의 생성(제품) -> 객체의 사용(제품사용)
		
		// new연산자는 객체를 만들고 그 객체의 주소가 어딘지 알려줌
		
		// 정리!
		// 참조변수의 타입과 생성하려는 객체의 타입은 일치해야함.
		// 객체를 사용하기 위해서는 반드시 참조변수가 필요하다.
		// 참조변수와 새로생성된 객체를 연결해줘야 한다. t = new Tv();
		
		// 객체는 tv클래스의 설계도를 바탕으로 만들어짐
		// 변수3개 메서드3 -> 6개의 멤버 -> tv라는 클래스가 여섯개의 구성요소를 가지고 있다.
	
		  class Tv {
			String color; // 색깔
			boolean power; // 전원상태
			int channel; // 채널
			
			void power() {power = !power;}
			void channelUp() {channel++;}
			void channelDown() {channel--;}
			}
		 
		
		// 예제
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t1.channel = 7;
		// t1과 t2는 별도이기 때문에 t1의 채널값을 바꾼다고해서 t2가 바뀌지 않음.
		// --> 객체마다 별도의 저장공간이 생긴다!
		
		// t1.channel = 7; 위에 t2 = t1;을 껴넣을 경우 t2의 주소값이 t1으로 바뀌며
		// t2의 객체는 더이상 사용이 불가능함 -> GC(garbage collector)가 메모리에서 제거
		// gc는 주기적으로 메모리를 확인하다가 사용할수없는 객체들을 찾으면 메모리에서 제거함 -> 불필요한 메모리의 낭비를 막음
		// 객체가 필요할때 만들어서 쓰기만하고 따로 정리를 안해줘도됨!
		
		// 주소값만 같다면 여러개의 참조변수로 하나의 객체를 사용할 수 있음
		// 하지만 하나의 참조변수로 여러가지 객체를 가리키는 건 불가능! -> 변수는 하나의 값만 저장가능하기때문
		
	
		// 예제2 -> 객체마다 별도의 저장공간을 가짐
		Tv t3 = new Tv(); // Tv t1; t1 = new Tv();를 한문장으로
		Tv t4 = new Tv();
		
		// 사용되고있는곳을 피 빈자리에 객체를 만들기 때문에 주소는 같을수가 없음
		
		System.out.println("t3의 channel값은" + t3.channel + "입니다.");
		System.out.println("t4의 channel값은" + t4.channel + "입니다.");
		
		t3.channel = 7;
		System.out.println("t3의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t3의 channel값은" + t3.channel + "입니다.");
		System.out.println("t4의 channel값은" + t4.channel + "입니다.");
		
		
		
	}

}
