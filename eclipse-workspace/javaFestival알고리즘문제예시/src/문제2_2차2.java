import java.util.Scanner;

public class ����2_2��2 {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//�� ���� ��¹� �ۼ��� �Է¹ޱ�
		System.out.print("�� ���� : ");
		int star = sc.nextInt();
		//for���� ����Ͽ� �ﰢ�� �����
		for(int i=0;i<star;i++) {
			for(int j = star; i<j;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
