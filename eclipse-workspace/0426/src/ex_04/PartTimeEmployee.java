package ex_04;

public class PartTimeEmployee extends Employee{
	
	// �ʵ� ����
//	private String empno;
//	private String name;
//	private int pay;
	private int workDay;
	
	// ������ �����
	public PartTimeEmployee(String empno,String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
		
	}
	// �� �޿��� ��� �� ����
	public int getMoneyPay() {
		return pay*workDay;
	}
    // ���:�̸�:�ϴ� ����
//	public String print() {
//		return empno +" : " + name + " : " + pay ;
//	}

}
