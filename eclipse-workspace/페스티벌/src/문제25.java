

public class ����25 {

	public static void main(String[] args) {
		//1���� �迭����
		int [] point = {92,32,52,9,81,2,68};
		//���밪�Լ�Math.abs()
		int min = (int)Math.abs(point[0]-point[1]);
		//����� �����ϴ� ���ڿ� ���� �ʱ�ȭ
		String result = null;
		//for��
		for(int i=0; i<point.length;i++) {
			for(int j=0; j<point.length;j++) {
				if(i != j) {
				if(min>(int)Math.abs(point[i]-point[j])) {
					min = (int)Math.abs(point[i]-point[j]);
					 result = "["+point[i]+","+point[j]+"]";
				}
				}
			}
		}
		System.out.println(result);
		

	}

}
