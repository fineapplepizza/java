import java.util.Iterator;
import java.util.Scanner;



public class ex10�迭 {

	public static void main(String[] args) {
		
		//�迭 ����
		int [] score = new int[5];
		
		//���ڸ� �Է��ϰ� �����ϱ�
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<score.length ; i++) {
			
			System.out.print((i+1) + "��° �Է�: ");
			score[i] = sc.nextInt();
		}
		
		// �Էµ� ���� ����ϱ�
		System.out.print("�Էµ� ����: ");
		for(int i = 0 ;  i < score.length ; i++) {
			System.out.print(score[i] + " ");
		}
		
		//�ְ� ���� ��� �ϱ�
		int max = score[0];
		for(int i = 0 ; i < score.length ; i++) {
			 if(max < score[i]) {
				 
				 max = score[i];
				
			 } 
			 }
		System.out.println();
		 System.out.println("�ְ� ����: " + max);
	    //�ּ� ���� ����ϱ�
			 int min = score[0];
		  for(int j = 0 ; j< score.length ; j++) {
			  if(min > score[j]) {
				  
				  min = score[j];
				  
			  }
		  }
		  System.out.println("�ּ� ����: " + min);
		

	}

}
