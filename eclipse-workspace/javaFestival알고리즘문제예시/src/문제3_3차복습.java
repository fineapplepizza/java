import java.util.Scanner;

public class ����3_3������ {

	public static void main(String[] args) {
		//��ĳ�� �����ϱ�
		Scanner sc = new Scanner(System.in);
		//����N�� �Է¹޴� ��¹��� �����ϰ� �Է¹ޱ�
		System.out.print("�����Է�: ");
		int n = sc.nextInt();
		//�������迭�� �����ϱ�
		int arr[][] = new int[n][n];
		//�������迭�� ���� �ʱ�ȭ�ϱ�
		int k=1;
		//for���� ����Ͽ� �������迭�� ���� �����ϱ�
		for(int i=0 ; i<arr.length;i++) {
			//if���� ����ؼ� ¦���� ���� �����ϱ�
			if(i%2==0) {
				for(int j=0;j<arr.length;j++) {
					arr[i][j] = k;
					k++;
				}
			}
			//Ȧ���� ���� �����ϱ� 
			if(i%2==1) {
				for(int j=arr.length-1;j>=0;j--) {
					arr[i][j] = k;
					k++;
				}
			}
		}
		//�������迭�� ����ϱ�
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
