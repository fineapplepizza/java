package day02;

import java.util.Scanner;

public class ex08���ǹ� {

	public static void main(String[] args) {
		
		// 1. ������ �Է¹��� �� �ִ� ��� �����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
	    int num = sc.nextInt();
	    
	    // �������� : ��ü ����(main �޼ҵ�)���� ���ϼ� �ִ� ����
	    String result = "";
		
	    //2. ������ Ȧ������ ¦������ �Ǵ�
	    if (num % 2 == 0) { // ¦�� �Ǵ�
//			System.out.println(num + "��(��) ¦���Դϴ�.");
	    	
	    	//Ư�� �������� ������ �� ������
	    	// �� ���������� ����� �ȴ�. -> ��������
	    	 result = "¦��";
		}
		else { //Ȧ��
//			System.out.println(num + "��(��) Ȧ���Դϴ�.");
			 result = "Ȧ��";
		}
         // if -else���� ��� ���������� ����Ǵ� �κ�
	    System.out.println(num + "�� " + result + "�Դϴ�.");
	    
	} //main�޼ҵ尡 ������ ����

}
