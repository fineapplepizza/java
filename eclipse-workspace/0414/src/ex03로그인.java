import java.util.Scanner;

public class ex03�α��� {

	public static void main(String[] args) {
		//�α��� ��� �����
		//1. ��ĳ�� �ҷ�����
		Scanner sc = new Scanner(System.in);
		while(true) {
		//2. ���̵� �Է��ϼ��� ��� �� �Է¹ޱ�
		// ���ڿ��� �Է��ϴ� ��� sc.next()��� Ȱ��
		System.out.print("���̵� �Է��ϼ��� : ");
		String id = sc.next();
		//3. ��й�ȣ�� �Է��ϼ��� ��� �� �Է¹ޱ�
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String pw = sc.next();
		//4. ���̵� Hello �̸鼭 ��й�ȣ 1234�϶� �α��� ����!>>���α׷� ����
		//�ڹٿ��� ���ڿ� ��ɿ��� == �� ��������.
		//==�� �⺻�� ������ Ÿ�Ը� ���� String�� ���� ���� String�� ������ ������ Ÿ��
		//����.equals()����� Ȱ���ؼ� �� �� �� ����
		if(id.equals("Hello") && pw.equals("1234")) {
			//�������� ��
			System.out.println("�α��� ����!");
			break;
		}else {
			System.out.println("���̵�� ��й�ȣ�� Ȯ�����ּ���~");
			//5. �� �� �ϳ��� Ʋ�� ��쿡�� ���̵�� ��й�ȣ�� Ȯ�����ּ��� ���!>>�ݺ��� ����
			//�������� ��
			//1.����ڿ��� ����� �ٽ��Ͻðڽ��ϱ�?(Y/N)
			System.out.print("�ٽ��Ͻðڽ��ϱ�?(Y/N)");
			//2.�� �ٽ��ҷ���! Y�Է¹ޱ�, �ƴϿ� �����ҷ���! N�Է¹ޱ�
			String confirm = sc.next();
			//3.���࿡ ����ڰ� N�� �Է��Ѵٸ� ���α׷��� ����
			if(confirm.equals("N")) {
				System.out.println("���α׷��� ����");
				break;
				
			}else if(confirm.equals("Y")) {
				//continue�� ���� while�� ������ ���� �̵� �������ִ°� ������ �ݺ��� �ٽ� ���� �ö�
				//continue�� ������ �ݺ��� ���������� ��������. �׸��� ���� �ٽ� �ѹ� �������ּ��� ����
				continue;
				
			}
					
		}
		
		
		
	}
		
		
		
	}

}
