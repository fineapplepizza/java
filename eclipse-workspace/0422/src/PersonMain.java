
public class PersonMain {

	public static void main(String[] args) {
		// ��ü ������ Ư¡
        // 1.��ü ������ main()�ȿ����� Ȱ���� �����ϴ�!
		// 2.new ��� Ű���带 ����ؾ� �Ѵ�
		//   new ��� Ű����� ���ÿ� default ������ �޼ҵ尡 ȣ���� �ȴ�.
		//Person�� default�����ڸ� �̿��� ��üperson1�� �����ϼ���.
		Person person1 = new Person();
		
		//person1��ü�� �ڽ��� �̸��� ���̷� name,age�� �ʱ�ȭ �ϼ���.
		person1.setName("ȫ�浿");
		person1.setAge(25);
		
		//2���� �Ű������� �Ѱܹ޴� �����ڸ� �̿��� ¦���� �̸��� ���̷� ��ü person2�� �����ϼ���.
		Person person2 = new Person("�迵��",27);
		
		//�� ��� ��ü�� �̸��� ���̸� �Ʒ��� ���� ����ϼ���.
		System.out.println("Person1�� �̸� :"+ person1.getName()+","+"���� :"+person1.getAge());
		System.out.println("Person2�� �̸� :"+ person2.getName()+","+"���� :"+person2.getAge());

	}

}
