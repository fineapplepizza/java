import java.util.Scanner;

public class ����5���� {

	public static void main(String[] args) {
		//��ĳ�� ����ϱ�
		Scanner sc = new Scanner(System.in);
		//�ִ�����&�ּҰ���� ���ϱ� ��¹� �ۼ�
		System.out.println("�ִ� �����&�ּ� ����� ���ϱ�");
	    //�ִ�����,�ּҰ���� ���� �ʱ�ȭ �ϱ�	
		int max = 0 , min =0;
		//����1�Է� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.println("����1�Է�>> ");
		int num1 =sc.nextInt();
		//����2�Է� ��¹� �ۼ� �� �Է¹ޱ�
		System.out.println("����2�Է�>> ");
		int num2 =sc.nextInt();
		//for��
		for(int i=1;i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {//if��
				max = i;
			}
		}
		//�ּҰ���� ���ϱ�
		min = num1*num2/max;
		
		//�ִ����� ��¹� �ۼ�
		System.out.println("�ִ�����: "+max);
		//�ּ۰���� ��¹� �ۼ�
		System.out.println("�ּҰ����: "+min);

	}

}
