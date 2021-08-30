package 업캐스팅;

public class Cat extends animal {

	//고양이만의 eat(),move()만들기
	@Override
	public void eat() {
		System.out.println("찜닭을 먹는다.");
	}

	@Override
	public void move() {
		System.out.println("점프를 한다.");
	}
	
	
	
	

}
