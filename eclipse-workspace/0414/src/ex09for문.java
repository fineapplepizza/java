import java.util.Scanner;

public class ex09for�� {

	public static void main(String[] args) {
		
		//��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		// �� ��� �� �Է��ϱ�
		System.out.print("�� �Է� : ");
        int  dan = sc.nextInt();
		int result = 0;
		//for���� ����ؼ� ������ ����ϱ�
				
			for(int j = 1; j<=9; j++) {
				result = dan*j;
				System.out.println(dan + "*" + j + "=" + (dan*j));
			}
			
		}

	}


