package 업캐스팅;

public class Dog extends animal{

	@Override
	public void eat() {
		System.out.println("초밥을 먹는다");
	}

	@Override
	public void move() {
		System.out.println("달리면서 움직인다.");
	}
	
	

}
