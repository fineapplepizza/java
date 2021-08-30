package ex_01;

public class Cat extends animal{
	
	// 고양이 만의 eat(),move() 만들기
	
    @Override
    public void eat() {
    	System.out.println("사료를 먹는다.");
    }
    
    @Override
    public void move() {
    	System.out.println("종이박스 안으로 들어간다.");
    }

}
