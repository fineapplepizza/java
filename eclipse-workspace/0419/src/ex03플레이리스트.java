import java.util.ArrayList;
import java.util.Scanner;

public class ex03�÷��̸���Ʈ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); //�뷡�� ����� ����Ʈ(�����Ұ���)
		
		while(true) {
			System.out.print("[1]�뷡�߰� [2]�뷡���� [3]�뷡��ȸ [4]����>> ");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("========���� ��� ���========");
				 if(arr.size() == 0) {
					 //�뷡�� ������
					 System.out.println("��� ����� �����ϴ�!");
				 }else{
					 //�뷡�� �߰�������
					 for(int i = 0; i<arr.size(); i++) {
						 System.out.println((i+1) + "." + arr.get(i));
					 }
				 }	
				System.out.println("===========================");
				System.out.println();
				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰�>>");
				int num2 = sc.nextInt();
				if(num2 == 1) {
					//�������� ��ġ�� �߰�
					System.out.print("�߰� �� �뷡 �Է�>> ");
					String song = sc.next();
					arr.add(song);
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
					
				}else if(num2 == 2) {
					//���ϴ� ��ġ�� �߰�
					System.out.print("�߰� �� �뷡 �Է�>> ");
					String song2 = sc.next();
					System.out.print("�߰� �� ��ġ �Է�>> ");
					int num3 = sc.nextInt();
					System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
					//���ϴ� ��ġ�� ������ �ֱ�
					// ��������� ���Ǽ��� �ֱ� ���ؼ� �ε��� -1
					arr.add(num3-1,song2);
				}
				
				
			}else if(num == 2) {
				System.out.println("========���� ��� ���========");

				//���� �� �뷡�� ������
				if(arr.size() == 0) {
					//�����Ͱ� ����.

					System.out.println("��� ����� �����ϴ�.");
				
			}else  {
				//�����Ͱ� �����Ѵ�.
				//���� �� �뷡�� ���� ��
				for(int i = 0; i<arr.size(); i++) {
					System.out.println((i+1) + "." +arr.get(i));
				}
				System.out.println("===========================");
				System.out.print("[1]���û��� [2]��ü����>> ");
				int num4 = sc.nextInt();
				if(num4 == 1) {
					//���� ���� �����ϱ�
					System.out.print("������ �뷡 ����>>");
					int num5 = sc.nextInt();
					arr.remove(num5-1);
				}else if(num4 == 2) {
					//��ü ���� �ϱ�
					arr.removeAll(arr);

					System.out.println("��ü ����Ʈ�� ���� �Ǿ����ϴ�.");
					
				}
				
				
			}
				
				
				
			}else if(num == 3) {
				System.out.println("========���� ��� ���========");
				 if(arr.size() == 0) {
					 //�뷡�� ������
					 System.out.println("��� ����� �����ϴ�!");
				 }else{
					 //�뷡�� �߰�������
					 for(int i = 0; i<arr.size(); i++) {
						 System.out.println((i+1) + "." + arr.get(i));
					 }
				 }	
				System.out.println("===========================");
				
			}else if(num == 4) {
				System.out.println("����ƽ��ϴ�.");
				break;
			}
		}
		

	}

}
