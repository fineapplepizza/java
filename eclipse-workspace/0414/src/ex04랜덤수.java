import java.util.Random;
import java.util.Scanner;

public class ex04������ {

	public static void main(String[] args) {
		
		// �������� �ҷ����� ���� ���
		Random rd = new Random();
		
		// rd.nextInt(10)
		// 0~9 (10����) ���ڰ� ����!
		int num = rd.nextInt(10)+1;
		int num2 = rd.nextInt(10)+1;
		
		// 1~10 ������ ������ ����!
		System.out.println("ù��° ������ : " + num);
		System.out.println("�ι�° ������ : " + num2);
		
		

	}

}
