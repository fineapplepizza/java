package ex_04;

public class TempEmployee extends Employee{
	//필드 정의
//	private String empno;
//	private String name;
//	private int pay;
	
	//생성자 정의
	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		
	}
	
	public int getMoneyPay() {
		return pay/12;
	}
	
//	public String print() {
//		return empno + " : " + name + " : " + pay; 
//	}

}
