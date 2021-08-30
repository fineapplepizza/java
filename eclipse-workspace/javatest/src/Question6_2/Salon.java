package Question6_2;

public class Salon extends Store{
	
	double technology;//기술 점수를 저장할 필드
	double kindness;//친절 점수를 저장할 필드
	
	public Salon(String name, String event,double techonology,double kindness,double price) {
		this.name = name;
		this.event = event;
		this.technology = technology;
		this.kindness = kindness;
		this.price = price;
	}

	@Override
	public double grade() {
		double result = (technology+kindness+price)/3;
		String result2 = String.format("%2.f", result);
		System.out.println(result2);
//		double result2 = (Math.round((result)*100)/(double)100);
		return 0;
	}
	

}
