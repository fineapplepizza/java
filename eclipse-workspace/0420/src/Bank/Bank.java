package Bank;

public class Bank {
	//1. 필드(속성)
	private int money;//캡슐화(정보은닉)
	
	//2. 메소드(기능)
	//메소드명 : deposit/매개변수 : 정수형 1개/ 리턴타입X
	//클래스에서 매개변수 만들때는 필드명과 동일하게 만드는게 대부분 방식
	public void deposit(int money) {
		this.money += money;
		//this >> 현재 클래스 자체를 지칭하는 키워드
	}
	//메소드명 : withdraw / 매개변수 : 정수형 1개 / 리턴타입X
	public void withdraw(int money) {
	    this.money -= money;
		
	}
	//메소드명 : showmoney/매개변수:X /리턴타입 정수형
	public int showmoney() {
		
		return money;
	}

}
