import java.util.Random;

public class ����5_2�� {

	public static void main(String[] args) {
		//8ĭ ũ���� �迭�� ����
		int arr[]= new int[8];
		//������ ����
		Random rd = new Random();
		//for���� �̿��Ͽ� �迭�� �ִ� ���� ���
		System.out.print("�迭�� �ִ� ��� ��: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(99)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//���� ū ���� ���
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("���� ū �� :"+max);
		//���� ���� ���� ���
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("���� ���� ��: "+min);

	}

}
