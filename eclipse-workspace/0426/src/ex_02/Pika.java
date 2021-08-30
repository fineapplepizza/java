package ex_02;

public class Pika extends Doll{
	// 피카츄 인형만 있는 클래스
	
//	public void pika() {
//		System.out.println("피카츄 인형!");
//	}
	
	// Doll 클래스로 부터 물려받는 메소드를 활용하여 
	// 피카츄 인형 만들기
	@Override
	public void doll() {
		System.out.println("피카츄 인형!");
	}

}
