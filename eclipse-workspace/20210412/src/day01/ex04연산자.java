package day01;

import java.util.Scanner;

//import java.util.Scanner;

public class ex04������ {
    // ��ɾ ��ǻ�Ϳ��� ����(����)�ϴ� �޼ҵ� -> main()
	public static void main(String[] args) {
		
		// ����ڷ� ���� �Է°� �ޱ� --> Ű����
		// Scanner class : �Է��� �����ִ� Ŭ����
		
		// 1.Scanner class �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// java.util�� ����()
		// 1. import ���콺�� ����
		// 2. import ����Ű -> ctrl + shift + 'o'(�ڵ�����)
		
		// �Է��� ���� �ȳ����� ���
		// ln�� �Ʒ��� ������ ��� 
		System.out.print("����1 �Է� : ");
       // Ű����� ���� ������ ������ �Է�
		// �������� �Է��ϱ� ���� ��� -> nexInt()
		int input1 = sc.nextInt(); 
		// �ϳ��� ������ �ΰ��� ������� ������ ǥ��?
		System.out.print("����2 �Է� : ");
    
		int input2 = sc.nextInt(); 
		
		System.out.println("�Էµ� ���� : "+ input1 +"," + input2);
		// �ΰ��� ������ ���Ѱ� ���
//		System.out.println("�� ���� ���� : " + (input1 + input2));
		
		// �ΰ��� ���� ���� ������ �� �ִ� ���� ����
		int result = input1 + input2;
		System.out.println("�� ���� ���� : " + result);

	} // main �޼ҵ� ������ �κ�

}
