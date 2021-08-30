package Question2;

public class Tv {
	
    int channel = 0;
    String color ="";
	
	//채널 1올리는 메소드
	public void channelUp() {
		channel++;
		
	}
	
	//채널 1내리는 메소드
	public void channelDown() {
		--channel;
		
	}
	
	//출력 메소드
	public void print() {
		System.out.println("Tv의 현재 채널은 : "+channel+"이고, Tv의 색깔은 "+color+"입니다.");
	}
	

}
