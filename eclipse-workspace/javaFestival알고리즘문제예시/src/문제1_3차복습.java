
public class ����1_3������ {

	public static void main(String[] args) {
		//getMiddle�޼ҵ带 ����ؼ� ��� ���� ��¹� �ۼ�
		System.out.println(getMiddle("test"));

	}
	//getMiddle�޼ҵ� �����ϱ�
	public static String getMiddle(String str) {
		//split()�Լ��� ����ؼ� �����ϳ��ϳ�  �迭�� �ֱ�
		String arr[]= str.split("");
		//if���� ����ؼ� �ܾ��� ���̰� Ȧ������ ¦������ �Ǵ��ϱ�
		if(arr.length%2==1) {//Ȧ���϶�
			int middle = arr.length/2;
			return arr[middle];
		}else {//¦���϶�
			int first = arr.length/2-1;
			int second = arr.length/2;
			
			return arr[first]+arr[second];
			
		}
		
//		return null;
	}
	

}
