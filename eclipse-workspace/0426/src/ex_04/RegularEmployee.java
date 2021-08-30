package ex_04;

public class RegularEmployee extends Employee{
	
//	private String empno ;
//	private String name ; 
//	private int pay ;
	private int bonus ;
	
	// 생성자 메소드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
		
	
	// 1. 월급 계산 메소드
	public int getMoneyPay() {
		return (pay+bonus)/12 ;
		
	}
	
	// 2. 출력을 위한 메소드
//	public String print() {
//		
//		return empno + " : "+ name + " : "+pay;
//		
//	}
	
	
}
