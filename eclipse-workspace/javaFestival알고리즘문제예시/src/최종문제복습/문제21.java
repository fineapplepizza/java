package ������������;

import java.util.Random;
import java.util.Scanner;

public class ����21 {

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//��������
		Random rd = new Random();
		//�ζǼ��ڸ� ������ �迭����
		int arr[]=new int [6];
		//for��
		for(int i=0;i<arr.length;i++) {
			//�迭����
			arr[i]=rd.nextInt(46)+1;
			//�ߺ�����
			for(int j=0 ;j<i;j++) {
				if(arr[i] == arr[j]) {
				i--;
				}
			}
		}
		//���
		for(int i=0; i<arr.length;i++) {
			System.out.println("����Ǽ��� : "+arr[i]);
			
		}

	}

}
