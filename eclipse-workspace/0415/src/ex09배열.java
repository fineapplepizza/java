import java.util.Scanner;

public class ex09�迭 {

	public static void main(String[] args) {
		
		//1. �迭 ����
		int [] num = new int [10] ;
		
		//2. ���� �Է� �޾� ����
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < num.length ; i++) {
			
			System.out.print((i+1) + "�� ° ���� �Է�>> ");
			num[i] = sc.nextInt();
		}
		
		//3. 3�� ������ ���!
         System.out.print("3�� ��� ���� �Է�: ");
			for(int i = 0 ; i<num.length ; i++) {
				if(num[i] % 3 == 0) {
					System.out.print(num[i] + " ");
				}
			}
		

	}

}
