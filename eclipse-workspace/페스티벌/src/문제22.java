

import java.util.Scanner;

public class ����22 {

	public static void main(String[] args) {
		//��ĳ�ʻ���
		Scanner sc = new Scanner(System.in);
		//�迭 ����
		int arr[] = new int[5];
		//for�� ���Ǽ�
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"��° ���� �� : ");
			arr[i]=sc.nextInt();
		}
		//����for�� ���
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+": ");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
