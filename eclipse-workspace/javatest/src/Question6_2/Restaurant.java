package Question6_2;


public class Restaurant extends Store {
	
    double service;//서비스 점수를 저장할 필드
	double flavor;//맛 점수를 저장할 필드
	double clean;//청결 점수를 저장할 필드

	//객체 생성시 가게들의 정보를 입력받는 생성자
	public Restaurant(String name, String event, double service, double flavor, double clean, double price) {
		this.name = name;
		this.event = event;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
		this.price = price;
	}

	@Override
	public double grade() {//서비스,맛,청결,가격 점수의 평균을 출력할 메소드
		double result = (service+flavor+clean+price)/4;
		
		String result2 = String.format("%.2f", result);
		System.out.println(result2);
		return 0;
		
	}

	public double getService() {
		return service;
	}

	public double getFlavor() {
		return flavor;
	}

	public double getClean() {
		return clean;
	}
	
	
	

}
