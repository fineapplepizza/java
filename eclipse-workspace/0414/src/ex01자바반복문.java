import java.util.Scanner;

public class ex01�ڹٹݺ��� {

	public static void main(String[] args) {
		//1.��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		int jjack = 0;
		int hole = 0;
		//while(){
		//2.�����Է��̶�� ��¹� �ۼ�
		while(true) {
		System.out.print("�����Է�: ");
		//3.���ڸ� �Է¹ޱ�
		int num = sc.nextInt();
		//4.-1�� �Է������� ���� ��Ű��.
		if(num == -1) {
			System.out.println("����Ǿ����ϴ�.");
			break;
		}
		//5.-1�� �ƴ� ��� >> ¦���� Ȧ���� ��
		//6.¦���� Ȧ���϶� ���� 1�� �����ϴ� �����ۼ�
		else if(num % 2 ==0) {
			//¦���� ���ϴ� ����
			jjack++;
		}
		else {
			//Ȧ���� ���ϴ� ����
			hole++;
		}
		//7.¦���� Ȧ���� ������ ���
		System.out.println("¦���� ���� : "+ jjack);
		System.out.println("Ȧ���� ���� : "+ hole);
		}
		

	}

}
