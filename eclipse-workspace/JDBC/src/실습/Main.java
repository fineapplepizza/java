package �ǽ�;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// ����ڰ� ���ԵǴ� View
		
		Scanner sc = new Scanner(System.in);
		
		boolean isOk= true;
		
		//��ü �������� Controller�� �ִ� �޼ҵ带 ����� �� �ֵ��� 
		//��ü �����ϱ�
		Controller controll = new Controller();
		
		while(isOk) {
		System.out.print("[1]ȸ������ [2]�α��� [3]��ȸ [4]���� [5]Ż�� [6]���� >>");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("���̵�: ");
			String id = sc.next();
			System.out.print("��й�ȣ: ");
			String pw = sc.next();
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int age = sc.nextInt();
			
			//�Էµ� ����ڷ� ���� �Էµ� �����͵��� insert �޼ҵ�� �����ϱ�
			int cnt = controll.insert(id, pw, name, age);
			//�� ������ �Ǵ��� ���� �ʴ��� �Ǵ�
			if(cnt >0) {
				System.out.println("ȸ������ ����");
			}else {
				System.out.println("ȸ������ ����");
			}
			
		}else if(choice == 2) {
			
		}else if(choice == 3 ) {
			//ȸ�� ��ü��ȸ ��� �����->selectAll()
			System.out.println("=====��ü ȸ��=====");
			ArrayList<MemberVo>list = controll.selectAll();
			
			
			for(int i =0;i<list.size();i++) {
				System.out.println(list.get(i).getId()+"\t"
						            + list.get(i).getPw()+"\t"
						            + list.get(i).getName()+"\t"
						            + list.get(i).getAge());
			}
		}else if(choice == 4) {
		     System.out.println("�������� ����");
		     System.out.println("���̵�>>");
		     String id = sc.next();
		     System.out.println("[1]��й�ȣ  >>");
		     String data = sc.next();
		     
		     int cnt = controll.update(id,data);
		     
		     // ������ ���� �Է¹ޱ� 
		     if(cnt >0) {
		    	 System.out.println("��������");
		     }else {
		    	 System.out.println("��������");
		     }
		}else if(choice == 5) {
			
		}else if(choice == 6) {
			System.out.println("���α׷� ����");
			isOk = false;
		}
		}
		

	}

}
