package �˰���������;

import java.util.Scanner;

public class ��������32�� {

	public static void main(String[] args) {
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//ä���ϱ� ��¹��ۼ�
		System.out.println("====ä���ϱ�====");
		String inputString = sc.next();//ä���� ����� ���ڿ�������
		//String[]split()�Լ��� �̿��ؼ� �迭�� ����
		String [] arr = inputString.split("");
		int cnt =1; //ī��Ʈ ���� �ʱ�ȭ\k
		int result =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("o")) {//if��������Ͽ� o,x�� �Ǵ�
				result += cnt;
				cnt++;
				
				//o�� ī��Ʈ 1�� ������
			}else {
				cnt =1;
			}
		}System.out.println(result);
		
		

	}
	

}
