
public class ex05�迭 {

	public static void main(String[] args) {
		//�����ڴ� ��Ƽ��Ʈ��.
		
		//1.������ �迭 ����
		int[] arr = {1,2,3,4,5,6,7,8};
		//2.��ü �迭 �˻� ���� ��, ¦���� ���� ���
		System.out.print("arr�� ����ִ� ¦����");
		for(int i =0; i<arr.length ;i++) {
			if(arr[i]%2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("�Դϴ�.");
	}

}
