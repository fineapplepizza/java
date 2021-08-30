package 실습;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 사용자가 보게되는 View
		
		Scanner sc = new Scanner(System.in);
		
		boolean isOk= true;
		
		//전체 구역에서 Controller에 있는 메소드를 사용할 수 있도록 
		//객체 생성하기
		Controller controll = new Controller();
		
		while(isOk) {
		System.out.print("[1]회원가입 [2]로그인 [3]조회 [4]수정 [5]탈퇴 [6]종료 >>");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("아이디: ");
			String id = sc.next();
			System.out.print("비밀번호: ");
			String pw = sc.next();
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			//입력된 사용자로 부터 입력된 데이터들을 insert 메소드로 전달하기
			int cnt = controll.insert(id, pw, name, age);
			//잘 수행이 되는지 되지 않는지 판단
			if(cnt >0) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
			
		}else if(choice == 2) {
			
		}else if(choice == 3 ) {
			//회원 전체조회 기능 만들기->selectAll()
			System.out.println("=====전체 회원=====");
			ArrayList<MemberVo>list = controll.selectAll();
			
			
			for(int i =0;i<list.size();i++) {
				System.out.println(list.get(i).getId()+"\t"
						            + list.get(i).getPw()+"\t"
						            + list.get(i).getName()+"\t"
						            + list.get(i).getAge());
			}
		}else if(choice == 4) {
		     System.out.println("수정사항 선택");
		     System.out.println("아이디>>");
		     String id = sc.next();
		     System.out.println("[1]비밀번호  >>");
		     String data = sc.next();
		     
		     int cnt = controll.update(id,data);
		     
		     // 수정될 내용 입력받기 
		     if(cnt >0) {
		    	 System.out.println("수정성공");
		     }else {
		    	 System.out.println("수정실패");
		     }
		}else if(choice == 5) {
			
		}else if(choice == 6) {
			System.out.println("프로그램 종료");
			isOk = false;
		}
		}
		

	}

}
