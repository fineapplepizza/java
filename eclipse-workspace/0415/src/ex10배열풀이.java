import java.util.Scanner;

public class ex10�迭Ǯ�� {

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
				
				// ������ �迭�� Ư������ �� ���Ŀ� ����ش�!
				// ���� ū �� ����, ���� �� ���� �Ǵ��� ������ ���� ������
				int max = studentGrade[0];
				int min = studentGrade[0];
				
				// �ݺ����� ����Ͽ� �渶�� ū ������ ���� ������ �Ǵ�
				for (int i = 0; i < studentGrade.length; i++) {
					if(studentGrade[i] > max) { // ū���� ���� �Ǵ�
						max = studentGrade[i];
						
					}else if(studentGrade[i] < min) { //���� ���� ���� �Ǵ�
						min = studentGrade[i];
					}
					
				}
				System.out.println();
				
				System.out.println("���� ū �� : " + max);
				System.out.println("���� ���� �� : " + min);


	}

}
