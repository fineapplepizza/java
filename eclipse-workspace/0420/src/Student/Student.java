package Student;

public class Student {
	//.�̸�,�й�,���̸� �����ϴ� ������ �����͸� ä���ִ� �����ڸ� �����.
	// ������(constructor)
	//�ڵ島�� ���̱� ���ؼ�
	//1.�޼ҵ�
	//2.Ŭ������ ������(�޼ҵ�)�� �̸��� �����ؾ��Ѵ�.
	//3.����Ÿ���� �������� �ʴ´�. void���� �ۼ����� �ʴ´�.
	//4.�޼ҵ� �ߺ�����(�����ε�)�����Ѵ�.
	public Student(String name, int age, String number) {
		//�ʵ忡 �ۼ��� ���� Ȱ���ϱ� ���ؼ� ������
		this.name = name;
		this.age = age;
		this.number = number;
	}
	public Student(String name, String number) {
		this.name = name;
		this.number = number;
		
	}
	//���赵�� �ۼ��ϴ� ����
	//1.�ʵ�
	//�̸�
	private String name;
	//�й�
	private String number;
	//����
	private int age;
	//�ڹ�����
	private int scoreJava;
	//������
	private int scoreWeb;
	//�ȵ�����
	private int scoreAndroid;
	//----------------------------------------------------//
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
    
	
}
