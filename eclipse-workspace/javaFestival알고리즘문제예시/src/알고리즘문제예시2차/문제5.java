package �˰���������2��;

import java.util.Random;

public class ����5 {

	public static void main(String[] args) {
		// 8ĭ ũ���� �迭�� ����
		int [] array = new int[8];
		// �������� �ҷ����� ���
		Random rd = new Random();
		
		// for���� �̿��Ͽ� �迭�� �������� �ʱ�ȭ
		for(int i =0;i<array.length;i++) {
			 array[i] = rd.nextInt(100)+1;
			 //�������� �ʱ�ȭ�� array�迭 ��¹� �ۼ�
			 System.out.print(array[i]+" ");
		}
		System.out.println();
		
        //���� ū �� max������ array[0]���� �ʱ�ȭ
		int max = array[0];
		// for���� �̿��Ͽ� array�迭�� �ִ� ���ڸ� max�� ��
		for(int i = 0; i<array.length;i++) {
			if(max < array[i]) { //if���� Ȱ���Ͽ� array[i]�� max���� ū�� �Ǵ�
				max = array[i]; // array[i]�� max���� ũ�� max�� ����
			}
			
		}
	    // ���� ū ���� ��¹� �ۼ�
		System.out.println(max);
		
		// ���� ���� �� min������ array[0]���� �ʱ�ȭ
		int min = array[0];
		for(int i=0;i<array.length;i++) { //array�迭�� �ִ� ���ڸ� min�� ���ϱ� ���� for�� ���
			if(min>=array[i]) {//if���� Ȱ���Ͽ� array[i]�� min���� �۰ų� ������ �Ǵ�
				min = array[i];//array[i]�� min���� �۰ų� ������ ���� min�� ����
			}
		}
		// ���� ���� �� ��¹� �ۼ�
		System.out.println(min);

	}

}
