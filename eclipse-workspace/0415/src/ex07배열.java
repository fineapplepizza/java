
public class ex07�迭 {

	public static void main(String[] args) {
		//�ִ밪 ���ϱ�!
		
		//�迭 ����
		int [] arr = {1,2,5,3,4};
		
		//�迭�� ���Ҷ� �񱳸� ���ؼ� �����̵Ǵ� ���� ���ϴµ� ���� [0]������ ����
		//�迭�ȿ� �ִ� ���� ���ϴ� ��� �����(�ϳ��� ���� �� ������ ���ؾߵǴϱ� arr[0])
		int maxNum = arr[0];
		//�迭�� ū ���� ã�� ����ϴ� ���α׷��� �ۼ��ϼ���
		for(int i = 0 ; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				//������ �� ū ���� �������� �� ���� �־��ֱ� ���ؼ�
				maxNum = arr[i];
			}
			
		}
		System.out.println("�ִ� ���� " + maxNum + "�Դϴ�.");

	}

}
