package ����;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		//��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		//���� �Է� �޴� ��¹� �ۼ��ϱ�
		System.out.print("���� >> ");
		//���� �Է� �ޱ�
		int age = sc.nextInt();
		// ��� ���� �����
		String people = "";
		//���� if���� ����Ͽ� �ʳ�,�߳�,��� �Ǵ��ϱ�
		//�ʳ� �Ǵ��ϱ�
		if(0<=age && age <= 40) {
			people = "�ʳ�";
		}
		//�߳� �Ǵ��ϱ�
		else if(age <= 60) {
			people = "�߳�";
		}
		//��� �Ǵ��ϱ�
		else if(61 <= age) {
			people = "���";
		}
		
		//��� ����ϱ�
		System.out.println(people + "�Դϴ�.");

	}

}
