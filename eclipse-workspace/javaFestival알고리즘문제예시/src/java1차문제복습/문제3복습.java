package java1����������;

public class ����3���� {

	public static void main(String[] args) {
		//��� �հ� ������ ���� �԰� ���� �ʱ�ȭ
		int a = 0, b =0;
		//for���� ����Ͽ� ����� ���
		for(int i = 1; i<=100;i++) {
			if(i%2==1) { //i�� ��� �϶�
				System.out.print(i+" ");
				a += i;//��� �հ�
			}else if(i%2==0) { //i�� ���� �϶�
				System.out.print(-i+" ");
				b+=-i;//���� �հ�
			}
			
		}
		System.out.println();
        // ��� ��¹� �ۼ�
		System.out.println("��� : "+(a+b));
		

	}

}
