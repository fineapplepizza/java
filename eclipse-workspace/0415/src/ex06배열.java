
public class ex06�迭 {

	public static void main(String[] args) {

		//�迭 ����
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int cnt = 0;
		//Ȧ�� ���� ����ϴ� ���α׷� �ۼ�
		System.out.print("array�� ����ִ� Ȧ����");
		for(int i = 0 ; i < arr.length ; i++) {
			
			
			if(arr[i]%2 == 1) {
				
				System.out.print(arr[i] + " ");
				cnt++;
			}
		
		}
		System.out.println("�̸�,");
		System.out.println( "��"+ cnt +"�� �Դϴ�.");
	}

}
