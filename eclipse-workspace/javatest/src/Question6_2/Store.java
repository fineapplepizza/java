package Question6_2;

public abstract class Store {
	 String name; //가게상호 이름을 저장할 필드
	 String event; //가게종목을 저장할 필드
	 double price; //가게 평점 중 가격점수를 저장할 필드
	
	//각 가게들의 점수의 평균을 출력할 메소드(추상메소드)
	public abstract double grade();

	public String getName() {
		return name;
	}

	public String getEvent() {
		return event;
	}

	public double getPrice() {
		return price;
	}
	
	
}

