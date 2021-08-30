
public class People {

	
		//설계도면을 작성하는 공간 >> 추상화 작업(필드짜는것)
		// 1. 필드(속성, 데이터)
		// - 이름
		String name; //설계를 하는 거니까 생성만 하는 것(어떤이름을 지을지 모르니깐 추상화작업)
		// - 나이
		int age;
		// - 키
		double height;
		// - 장기
		String [] organs; 
		
		
		
		
		
		//2. 메소드(기능,로직)
        // 1.밥먹는다
		// static은 될 수 있으면 사용안한다. 클래스 만들때는 잘안쓰는 개념
		public void eat() {
			System.out.println("밥을 먹는다.");
			
		}
		// 2.잔다
        public void sleep() {
        	System.out.println(name+"잠을 잔다.");
			
		}
		
		// 3.공부한다.
        public void study() {
        	System.out.println("공부를 한다.");
	
}
        //main메소드가 없으니까 실행할수 없다.
	}


