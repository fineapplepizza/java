package ex_04;

public class RegularEmployee extends Employee{
	
//	private String empno ;
//	private String name ; 
//	private int pay ;
	private int bonus ;
	
	// ������ �޼ҵ�
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
		
	
	// 1. ���� ��� �޼ҵ�
	public int getMoneyPay() {
		return (pay+bonus)/12 ;
		
	}
	
	// 2. ����� ���� �޼ҵ�
//	public String print() {
//		
//		return empno + " : "+ name + " : "+pay;
//		
//	}
	
	
}
