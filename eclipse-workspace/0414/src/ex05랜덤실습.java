import java.util.Random;
import java.util.Scanner;

public class ex05�����ǽ� {

	public static void main(String[] args) {
		
		//1 ���� �� ��� �ҷ�����
		Random rd = new Random();
		//��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		while(true) {
		//2.(0~9)10���� ���� ����!
		int num1 = rd.nextInt(10)+1;
		int num2 = rd.nextInt(10)+1;
		
		//3.����ڷκ��� �� �Է¹ޱ�
	    
		System.out.print(num1 + "+" + num2+ "=");
		int num3 = sc.nextInt();
		
        //4.������ ������ ������ Ȯ��
		if(num3 == num1+num2) {
			System.out.println("Success");
		}else {
			System.out.println("Fail");
			
		}
		//5.Y/N �Է¹ޱ�
		System.out.print("��� �Ͻðڽ��ϱ� >> ");
		String choice = sc.next();
		//6.Y->���ο� ������ ����
		if(choice.equals("Y")){
			continue;
			
		}
		else if(choice.equals("N")) {
			//7.N->���α׷� ����
			System.out.println("���α׷�����");
			break;
		}
	    }
		
	}

}
