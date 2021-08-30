package ex_04;

public class Main {

	public static void main(String[] args) {
		RegularEmployee regular = new RegularEmployee("SMHRD001","홍길동",4000,400);
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "만원");
		
		System.out.println();
		
		//TempEmployee 생성자를 이용해 객체temp를 만드세요.
		TempEmployee temp = new TempEmployee("SMHRD002","박지수",3000);
		//temp 객체를 이용하여 아래와 같이 출력하세요.
		System.out.println(temp.print());
        //temp 객체를 이용하여 월 급여를 구하여 아래와 같이 출력하세요.
		System.out.println(temp.getMoneyPay()+"만원");
		
		System.out.println();
		
		//PartTimeEmployee생성자를 이용해 객체 partTime을 만드세요.
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003","김감독" ,10,10);
		//partTime 객체를 이용하여 아래와 같이 출력하세요.
		System.out.println(partTime.print());
		//partTime객체를 이용하여 월 급여를 구하여 아래와 같이 출력하세요.
		System.out.println(partTime.getMoneyPay()+"만원");
		
		// 하나의 계산기로 여러 직급의 Pay 계산!
		PayCalculator cal = new PayCalculator();
		int money = cal.run(regular);
		
		System.out.println("money : "+money);

	}

}
