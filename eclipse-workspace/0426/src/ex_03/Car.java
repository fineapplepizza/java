package ex_03;

// �߻� Ŭ���� �����
// abstract
// 1. �߻� Ŭ������ �ϳ� �̻��� �߻� �޼ҵ带 �����ϰ� �־�� �Ѵ�.
public abstract class Car {
	
	// ������ �� �� �ִ� ��� -> �߻�޼ҵ�� ����
	// �߻� �޼ҵ�� ��ü���� ������ ������ ����. -> ��ü(����,���)�� ������ ����.
	// �߻� �޼ҵ�� �̷��� ����� �ֽ��ϴٶ�� �˷���
	public abstract void runner() ;
	
	int tire = 4;
	String color;
	
	// Ÿ�̾� ������ Ȯ���ϱ� ���� �޼ҵ�
	public int getTire() {
		return tire;
	}

}
