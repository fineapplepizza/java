package Question2;

public class Tv {
	
    int channel = 0;
    String color ="";
	
	//ä�� 1�ø��� �޼ҵ�
	public void channelUp() {
		channel++;
		
	}
	
	//ä�� 1������ �޼ҵ�
	public void channelDown() {
		--channel;
		
	}
	
	//��� �޼ҵ�
	public void print() {
		System.out.println("Tv�� ���� ä���� : "+channel+"�̰�, Tv�� ������ "+color+"�Դϴ�.");
	}
	

}
