import java.util.Random;

public class ����5_3�� {

	public static void main(String[] args) {
		//������ �����ϱ�
		Random rd = new Random();
		//�迭 �����ϱ�
		int arr[] = new int[6];
		//for���� ����ؼ� ����Ǽ��� ����ϱ�
		for(int i=0; i<arr.length;i++) {
			arr[i]=rd.nextInt(45)+1;
			//�ߺ��� �����ϱ�
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		//�ζ����α׷� ����ϱ�
		for(int i=0; i<arr.length;i++) {
				System.out.println("����Ǽ���"+arr[i]);
			
		}
		
		

	}

}
