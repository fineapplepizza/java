
public class Person {
	
	// ����� �̸��� ����, �ൿ���� ������ �� �ִ� Ŭ���� ����
	// Ŭ������ ���� -> �ʵ�(�Ӽ�,������),�޼ҵ�(�ൿ,����)
	
	// 1.�ʵ� ����
	private String name ;
	private int age;
	
	// 2.�޼ҵ� ����
	// ������ �޼ҵ� Ư¡
	// 1.������ Ÿ���� �������� �ʴ´�(void X)
	// 2.������ �޼ҵ��� �̸� Ŭ������ �̸��� �����ϴ�.
	// 3.������ �޼ҵ��� �����ε�(�ߺ�����)�� �����ϴ�.
	
	// default ������ �޼ҵ�
	public Person() {
//		// �ƹ��� ��ɵ� ���� �ʰ� �������� �ʴ� �⺻���� ������
	}
	
	// Person ������ �޼ҵ� �����ε�(�ߺ�����)-�Ȱ��� �̸����� �ߺ��ǰ� �����ϰڴٴ� ��
	// 2���� �Ű������� �ʱ�ȭ �� �� �ִ� ��� ����
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		// ���赵�� ����Ǿ� �ִ� name �����ϴ� ���
		return name;
	}

	public void setName(String name) {
		// �޼ҵ� ȣ��� �ۼ��Ǵ� �Ű����� �����͸� ���赵�� �����ϴ� ���
		this.name = name;
	}

	public int getAge() {
		// age ������ ���ִ� ���
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//get/set() ����Ű -> alt + shift +s
	//�����Ҷ��� ����Ű ���� ���°� ��õ
	//������: � ������ �Ȱ��� ��ü�� ����� �������� �ɼ� ���� �����ϴ� ��

}
