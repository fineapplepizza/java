import java.util.Scanner;

public class ����4_3�� {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//n�Է� ��¹� �ۼ��� �Է¹ޱ�
		System.out.print("n �Է� : ");
		int n = sc.nextInt();
		//������ �� ���� �ʱ�ȭ�ϱ�
		int hap =1;
		//for���� ����Ͽ� n��° �ױ��� ����Ͻÿ�
		for(int i=1;i<=n;i++) {
			System.out.print(hap+" ");
			hap+=i;
		}

	}

}
