package ex_02;

public class Main {

	public static void main(String[] args) {
		
		// ������ ���� �� �ִ� �����̱� ��踸���
		// ��� / ����
		
		// �����̱� ��ü ����
		Machine m = new Machine();
		// ���� ��ü ����
		Pika pika = new Pika();
		
		
		m.run(pika);
		
		//���̸� ������ �̾ƺ���!
		Pairi pairi = new Pairi();
		m.run(pairi);
		
		//���α� ������ �̾ƺ���!
		Kkobuk kkobuk = new Kkobuk();
		m.run(kkobuk);
		
		System.out.println();
		
		m.run(new Pairi());
		m.run(new Pika());
		m.run(new Kkobuk());

		// m.run(kkobuk);

	}
	
	

}
