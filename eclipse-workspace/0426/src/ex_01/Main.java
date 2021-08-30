package ex_01;

public class Main { // Main클래스 만들때 꼭 대문자로 해야한다. 소문자로하면 main()메소드랑 햇갈려해서 에러 날 수 있음

	public static void main(String[] args) { 
		
		// 다형성 : 다양한 형태로 존재하지만 같은 기능을 지니고 있는 것
		// 1. 메소드 오버라이딩
		// 2. 상속활용(상속 + 캐스팅 + 오버라이딩)
		
		animal a1 = new animal();
		animal a2 = new animal();
		
//		a.eat();
//		a.move();
//		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.eat();
		c.eat();
		
		// 업캐스팅(자동형변환) : 고양이는 동물이다.
		a1 = d; // animal의 클래스 형태로 형변환
		a2 = c; 
		
		a1.eat();
		a2.eat();
		
		// 다운캐스팅 : 부모클래스가 자식클래스 타입으로 형변환
		// 1.강제형변환이 필요하다!
		// 2.반드시 업캐스팅으로 생성된 객체에 한해서만 다운캐스팅이 가능하다.
		
		Dog d2 = (Dog)a1;
		Cat c2 = (Cat)a2;
		
		System.out.println();
		d2.eat();
		c2.eat();
		
		// 업캐스팅이 진행되지 않은 다운캐스팅에서는 -> 컴파일 오류 / 코드상의 에러X
//		animal a = new animal();
//		Cat cat = (Cat)a;
		
		//다형성 
		animal ani = new Dog();
		ani.eat();
		ani.move();
		
		System.out.println();
		
		animal ani2 = new Cat();
		ani2.eat();
		ani2.move();

	}

}
