package �˰���������;

public class ��������25�� {

	public static void main(String[] args) {
		//1���� �迭 ����
		int [] point = {92,32,52,9,81,2,68};
		//���� ���� ���ڸ� �����ϴ� ���� �ʱ�ȭ
		//Math.abs�޼ҵ�� �Ÿ��� ���� �� ������ ������ �ʰ� �Ѵ�.
		int min = Math.abs(point[0]-point[1]);
		// ����� �����ϴ� ������ ���ڿ�Ÿ������ �ʱ�ȭ�Ѵ�.
		String result = null;
		int first =0;
		int second =0;
		//���� for���� ����ؼ� ������ �Ÿ��� ��
		for(int i=0;i<point.length;i++) {
			for(int j=0; j<point.length;j++) {
				if(i != j) { // if���� ����ؼ� ������ ���������� �Ÿ� ��
					if(min>Math.abs(point[i]-point[j])) {
						min = Math.abs(point[i]-point[j]);
						//min���� ������ result�� �� ���� �����Ѵ�.
						result = "[" + point[i]+","+point[j]+"]";
						first =i;
						second =j;
					}
				}
			}
		}
		//��� ���
		System.out.println("result = "+"["+first+","+second+"]");

	}

}
