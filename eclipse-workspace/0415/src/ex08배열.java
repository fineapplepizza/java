import java.util.Scanner;

public class ex08�迭 {

	public static void main(String[] args) {
		
	
		//ũ�Ⱑ 5�� ������ �迭 ����
		int [] studentGrade = new int[5];
		//������ �Է��Ͽ� �迭�� ����
		//��ĳ�� ��� �ҷ�����
		Scanner sc = new Scanner(System.in);
		
		//������ ���������� �Է� �� �� �ִ� for�� �ۼ�
		for(int i = 0 ;  i < studentGrade.length ; i++) {
			
			System.out.print((i+1) + "��° �Է� >>");
			// �Է°� �迭�� �־��ֱ�
			  studentGrade[i] = sc.nextInt();
			  
			  
		}
		System.out.print("�Էµ� ���� : ");
		//3. �Էµ� ��� ������ ���! -> �ݺ������� ��� for��
		for(int i = 0; i < studentGrade.length; i++) {
			System.out.print(studentGrade[i] + " ");
		}

	}

}
