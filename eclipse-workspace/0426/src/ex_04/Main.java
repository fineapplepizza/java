package ex_04;

public class Main {

	public static void main(String[] args) {
		RegularEmployee regular = new RegularEmployee("SMHRD001","ȫ�浿",4000,400);
		
		System.out.println(regular.print());
		System.out.println(regular.getMoneyPay() + "����");
		
		System.out.println();
		
		//TempEmployee �����ڸ� �̿��� ��ütemp�� ���弼��.
		TempEmployee temp = new TempEmployee("SMHRD002","������",3000);
		//temp ��ü�� �̿��Ͽ� �Ʒ��� ���� ����ϼ���.
		System.out.println(temp.print());
        //temp ��ü�� �̿��Ͽ� �� �޿��� ���Ͽ� �Ʒ��� ���� ����ϼ���.
		System.out.println(temp.getMoneyPay()+"����");
		
		System.out.println();
		
		//PartTimeEmployee�����ڸ� �̿��� ��ü partTime�� ���弼��.
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003","�谨��" ,10,10);
		//partTime ��ü�� �̿��Ͽ� �Ʒ��� ���� ����ϼ���.
		System.out.println(partTime.print());
		//partTime��ü�� �̿��Ͽ� �� �޿��� ���Ͽ� �Ʒ��� ���� ����ϼ���.
		System.out.println(partTime.getMoneyPay()+"����");
		
		// �ϳ��� ����� ���� ������ Pay ���!
		PayCalculator cal = new PayCalculator();
		int money = cal.run(regular);
		
		System.out.println("money : "+money);

	}

}
