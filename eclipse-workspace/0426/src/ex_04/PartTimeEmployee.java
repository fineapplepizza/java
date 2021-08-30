package ex_04;

public class PartTimeEmployee extends Employee{
	
	// 필드 정의
//	private String empno;
//	private String name;
//	private int pay;
	private int workDay;
	
	// 생성자 만들기
	public PartTimeEmployee(String empno,String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
		
	}
	// 월 급여를 계산 후 리턴
	public int getMoneyPay() {
		return pay*workDay;
	}
    // 사번:이름:일당 리턴
//	public String print() {
//		return empno +" : " + name + " : " + pay ;
//	}

}
