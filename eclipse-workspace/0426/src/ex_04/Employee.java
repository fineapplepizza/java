package ex_04;

public abstract class Employee {
	
	// ��� ������ Ŭ������ ���� ����Ǵ� �ʵ�, �޼ҵ带 ���ϰ� �ִ�!
	// ���� �ʵ� ������ ���,�̸�,�ϴ��� �����ϰ� ���������ڸ� protected�� ������ ��
	// protected: ����� �ްų� ���� ��Ű�� �ȿ� �ִٸ� �ܺο����� ������ �����ϴ�!
	protected String empno;
	protected String name;
	protected int pay;
	
	//���� ����� getMoneypay()�� �߻�޼ҵ�� �����Ͻÿ�.
	//�߻� �޼ҵ��� Ư¡ -> ��ü�� ������ ���� �ʴ´�!
	//               -> �߻� �޼ҵ�� �߻� Ŭ������ ���ԵǾ�� �Ѵ�.
	public abstract int getMoneyPay();
	
	//���� ����� print()�� �޼ҵ�� �����Ͻÿ�.
	//�Ϲ����� �޼ҵ嵵 ���Ҽ� �ִ�!
	public String print() {
		return empno+" : "+name+" : "+pay;
	}
	

}
