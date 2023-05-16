import java.util.Scanner;

public class Ex4_8 {

	public static void main(String[] args) {
		
		// break문 : 자신이 포함된 하나의 반복문을 벗어난다.
		
		// 예제
		int sum = 0;
		int i = 0;
		
		while(true) { // 무한 반복문, true생략 불가!
			if(sum > 100)
				break; // while문(자신이 속한 하나의 반복문)을 완전히 벗어남
			
			++i;
			sum += i; // break문의 실행으로 이 두문장은 실행X
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		
		// for문의 무한 반복문은 for(;true;){}, true생략가능
		
		
		// continue문 : 자신이 포함된 반복문의 끝으로 이동, 다음 반복으로 넘어감
		// 전체 반복 중에서 특정 조건시 반복을 건너뛸 때 유용
		
		// 예제
		for(i = 0; i <= 10; i++) {
			if(i % 3 == 0) //3의 배수 
				continue;
			System.out.println(i);
		}

		// 예제2
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
		}
		
		
		// 이름붙은 반복문 : 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다.
		// 중첩반복문을 벗어나야 하는 경우 사용
		
		// 예제
		Loop1 : for(i = 2; i <= 9; i++) { // for문에 Loop1이라는 이름을 붙임
			for(int j = i; j <= 9; j++) {
				if(j==5)
					break Loop1;
//					break;
//					continue Loop1;
//					continue;
//				
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}
		
		// continue Loop1 이런식으로도 사용가능하지만 사용하는 경우가 별로X
		
		// 예제2
		outer:
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				//System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			for(;;) { // 무한 반복문
				System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num==0)
					break; // 계산 종료. for문을 벗어난다.
				
				if(num==99)
					break outer; // 전체종료. for문과 while문을 모두 벗어난다.
				
				switch(menu) {
				case 1 :
					System.out.println("result=" + num*num);
					break;
				case 2 :
					System.out.println("result=" + Math.sqrt(num));
					break;
				case 3 :
					System.out.println("result=" + Math.log(num));
					break;
				}
			} // for(;;)
		} // while의 끝
		System.out.println("프로그램이 종료되었습니다.");
	} // main의 끝
}
