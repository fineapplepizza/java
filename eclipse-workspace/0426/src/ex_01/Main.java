package ex_01;

public class Main { // MainŬ���� ���鶧 �� �빮�ڷ� �ؾ��Ѵ�. �ҹ��ڷ��ϸ� main()�޼ҵ�� �ް����ؼ� ���� �� �� ����

	public static void main(String[] args) { 
		
		// ������ : �پ��� ���·� ���������� ���� ����� ���ϰ� �ִ� ��
		// 1. �޼ҵ� �������̵�
		// 2. ���Ȱ��(��� + ĳ���� + �������̵�)
		
		animal a1 = new animal();
		animal a2 = new animal();
		
//		a.eat();
//		a.move();
//		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		c.eat();
		
		// ��ĳ����(�ڵ�����ȯ) : ����̴� �����̴�.
		a1 = d; // animal�� Ŭ���� ���·� ����ȯ
		a2 = c; 
		
		a1.eat();
		a2.eat();
		
		// �ٿ�ĳ���� : �θ�Ŭ������ �ڽ�Ŭ���� Ÿ������ ����ȯ
		// 1.��������ȯ�� �ʿ��ϴ�!
		// 2.�ݵ�� ��ĳ�������� ������ ��ü�� ���ؼ��� �ٿ�ĳ������ �����ϴ�.
		
		Dog d2 = (Dog)a1;
		Cat c2 = (Cat)a2;
		
		System.out.println();
		d2.eat();
		c2.eat();
		
		// ��ĳ������ ������� ���� �ٿ�ĳ���ÿ����� -> ������ ���� / �ڵ���� ����X
//		animal a = new animal();
//		Cat cat = (Cat)a;
		
		//������ 
		animal ani = new Dog();
		ani.eat();
		ani.move();
		
		System.out.println();
		
		animal ani2 = new Cat();
		ani2.eat();
		ani2.move();

	}

}
