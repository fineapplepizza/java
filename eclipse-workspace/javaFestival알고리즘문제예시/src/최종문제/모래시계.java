package ��������;

public class �𷡽ð� {

	public static void main(String[] args) {
		//�˰��� ������ Ǯ�� ��� ������� ����Ͻÿ��� �迭�� Ǫ�°� ��������
		
		// �迭 ����
		int array[][]=new int[5][5];
		char ch ='A';
		
		//5��5�� �迭 �����
		//i->��,j->��
		for(int i=0;i<=4;i++) {
			//[0,*],[1,*]�϶�
			if(i < 2) {
				//0->4-0=4,4-1=3,4-2=2,4-3=1,4-4=0
				//1->4-1=3,4-2=2,4-3=1
				for(int j = i; j<=4-i;j++) {
					array[i][j]=ch++;
				}
			}else if(i == 2) {
				array[2][2]=ch++;
			}
			// [3,*],[4,*]�϶�
			else {
				for(int j= 4-i;j<=i;j++) {
					array[i][j] = ch++;
				}
			}
		}
		//�𷡽ð� ���
		for(int i=0; 1<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print((char)array[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
