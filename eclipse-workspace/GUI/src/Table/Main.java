package Table;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scanner�� ���ؼ� �̸�, ����, ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int choice;
		
		MemberVO vo;
		Tableview view;
		ArrayList<MemberVO> members = new ArrayList<>();
		
		do {
			
			System.out.print("�̸� : ");
			String name = sc.next();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			System.out.print("���� : ");
			String gender = sc.next();
			
			vo = new MemberVO(name,age,gender);
			members.add(vo);
			
			view = new Tableview(members);
			
			System.out.print("[1]�߰� [2]���� >> ");
		    choice = sc.nextInt();
		    
		}while(choice != 2);
		

	}

}
