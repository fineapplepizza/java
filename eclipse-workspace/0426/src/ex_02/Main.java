package ex_02;

public class Main {

	public static void main(String[] args) {
		
		// 인형을 뽑을 수 있는 인형뽑기 기계만들기
		// 기계 / 인형
		
		// 인형뽑기 객체 생성
		Machine m = new Machine();
		// 인형 객체 생성
		Pika pika = new Pika();
		
		
		m.run(pika);
		
		//파이리 인형을 뽑아보자!
		Pairi pairi = new Pairi();
		m.run(pairi);
		
		//꼬부기 인형을 뽑아보자!
		Kkobuk kkobuk = new Kkobuk();
		m.run(kkobuk);
		
		System.out.println();
		
		m.run(new Pairi());
		m.run(new Pika());
		m.run(new Kkobuk());

		// m.run(kkobuk);

	}
	
	

}
