package ex_03;

public class Main {

	public static void main(String[] args) {
		
		//  �߻�ȭ ? ���� ��ü���� ���������� ���Ǵ� ��ɵ��� �̾Ƴ��� �� 
		
		Porche po = new Porche();
		System.out.println(po.getTire());
		po.color = "������";
		po.runner();
		po.wet();
		
		Volvo vol = new Volvo();
		vol.runner();
		vol.pilot();
		vol.color = "�Ķ���";
		
		// �߻� Ŭ������ ��üȭ�� �� �� ����!
		// ���(��ĳ����,�ٿ�ĳ����,�߻�ȭ,������)�� ���Ͽ� ���� ����� ��! ��üȭ �Ͽ� �����ؾ� �Ҷ� �߻�ȭ�� ����Ѵ�.
//		Car c = new Car();


		
		

	}

}
