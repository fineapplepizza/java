package java3������;

import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		 // ��ĳ�� �����ϱ�
	      Scanner sc = new Scanner(System.in);
	      // ������ �Է��ϴ� ��¹��� �Է¹ޱ�
	      System.out.print("������ �Է��Ͻÿ�>> ");
	      int num = sc.nextInt();
	      // ������ �迭�� �����ϱ�
	      int[][] array = new int[num][num];
	      // ������ �迭�� ���� �����ϴ� ���� �ʱ�ȭ�ϱ�
	      int k = 1;
	      // ����for���� �̿��Ͽ� �������迭�� ���ڸ� �����ϱ�
	      for (int i = 0; i < array.length; i++) {
	         if (i % 2 == 0) {// Ȧ�����϶� ���� ����
	            for (int j = 0; j < array.length; j++) {
	               array[i][j] = k++;
	            }
	         } else {// ¦�����϶� ���� ����
	            for (int j = array.length - 1; j >= 0; j--) {
	               array[i][j] = k++;
	            }
	         }
	      }
	      // ����for���� �̿��Ͽ� �������迭 ����ϱ�
	      for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array.length; j++) {
	            System.out.print(array[i][j] + "\t");
	         }
	         System.out.println();
	      }


	}

}
