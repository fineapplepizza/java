package �佺Ƽ��;

import java.util.Scanner;

public class ���丮�� {

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//�Է�
	     System.out.print("�Է�: ");
	     int num = sc.nextInt();
	     int result =1;
		//for
	     for(int i=1 ;i<=num;i++) {
	    	 result *=i;
	     }
		//���
	     System.out.println("���: "+result);

	}

}
