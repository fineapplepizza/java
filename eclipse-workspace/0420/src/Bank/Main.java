package Bank;

public class Main {

	public static void main(String[] args) {
		//��ü�� �����ϴ� ����
		Bank bank1 = new Bank();
		
		//1.money�� 50000�� �ֱ� 
		bank1.deposit(50000);
		//2.money���� 30000�� ����
		bank1.withdraw(30000);
		//3. �� �ܾ��� �����ֱ�.
		System.out.println(bank1.showmoney());

	}

}
