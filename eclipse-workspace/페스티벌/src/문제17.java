

import java.util.Scanner;

public class ����17 {

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//n �Է� ��¹� �Է�
		System.out.print("n �Է�: ");
		int n = sc.nextInt();
		//��� �� ����
		int sum =1;
		for(int i=1; i<=n;i++) {
             System.out.print(sum+" ");
             sum +=i;
		}

	}

}
