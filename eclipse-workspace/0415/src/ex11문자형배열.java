import java.util.Scanner;

public class ex11�������迭 {

	public static void main(String[] args) {
		
		//������ Ÿ���� �迭 ����
		char[] game = {'��','��'};
		
		//�迭�� �������
		//1.�迭 ������ (ũ��) -> �� ����
		//2.�迭�� ����� ���ÿ� �� ����
		
		
		//���ڸ� �Է¹��� �� �ִ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���>>");
		int num = sc.nextInt();
		
		//�Է¹��� ���ڰ� ¦��,Ȧ�� �Ǵ�
		//'��','��' ���!

		for(int i = 0; i<num;i++) {
//		if(i % 2 == 0) {
//			System.out.print(game[0]);
//		} else {
//			System.out.print(game[1]);
//
//			
//		}
			System.out.print(i%2==0?  game[0] : game[1]);
		}

	}

}
