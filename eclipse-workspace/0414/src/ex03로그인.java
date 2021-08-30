import java.util.Scanner;

public class ex03로그인 {

	public static void main(String[] args) {
		//로그인 기능 만들기
		//1. 스캐너 불러오기
		Scanner sc = new Scanner(System.in);
		while(true) {
		//2. 아이디를 입력하세요 출력 후 입력받기
		// 문자열을 입력하는 방법 sc.next()기능 활용
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		//3. 비밀번호를 입력하세요 출력 후 입력받기
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		//4. 아이디가 Hello 이면서 비밀번호 1234일때 로그인 성공!>>프로그램 종료
		//자바에서 문자열 기능에는 == 을 쓸수없다.
		//==은 기본형 데이터 타입만 가능 String은 쓸수 없음 String은 참조형 데이터 타입
		//문자.equals()기능을 활용해서 비교 할 수 있음
		if(id.equals("Hello") && pw.equals("1234")) {
			//성공했을 때
			System.out.println("로그인 성공!");
			break;
		}else {
			System.out.println("아이디와 비밀번호를 확인해주세요~");
			//5. 둘 중 하나라도 틀린 경우에는 아이디와 비밀번호를 확인해주세요 출력!>>반복문 시작
			//실패했을 때
			//1.사용자에게 물어보기 다시하시겠습니까?(Y/N)
			System.out.print("다시하시겠습니까?(Y/N)");
			//2.네 다시할래요! Y입력받기, 아니요 종료할래요! N입력받기
			String confirm = sc.next();
			//3.만약에 사용자가 N을 입력한다면 프로그램을 종료
			if(confirm.equals("N")) {
				System.out.println("프로그램을 종료");
				break;
				
			}else if(confirm.equals("Y")) {
				//continue를 쓰면 while문 끝나기 전에 이동 실행해주는게 없으면 반복문 다시 위로 올라감
				//continue는 무조건 반복문 마지막까지 가버린다. 그리고 나서 다시 한번 실행해주세요 개념
				continue;
				
			}
					
		}
		
		
		
	}
		
		
		
	}

}
