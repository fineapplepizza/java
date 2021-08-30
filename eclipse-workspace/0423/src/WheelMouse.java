
public class WheelMouse extends Mouse {
	//기존 Mouse 클래스를 통하여 기능 물려받기! -> 상속을 받기
	
	//상속의 키워드 -> extends(확장하다 의미)
	// 상속의 문법 -> 자식 클래스 extends 부모 클래스(부모로부터 확장되어 있는 자식 클래스 입니다.)	

	//마우스의 기능 설계
	//메소드 오버라이딩(재 정의)
//		//1. 부모가 가지고 있는 기능을 업그레이드 해서 생성 좌 클릭 
		public void leftClick() {
			System.out.println("좌 더블클릭!!");
		}
		
		
//		//2. 우 클릭 하기 메소드 -> rightClick()
//		public void rightClick() {
//			System.out.println("우 클릭!!");
//		}
//		//3. 드래그 하기 메소드->drag
//		public void drag() {
//			System.out.println("드래그 하기~");
//		}
		
		@Override
		public void rightClick() {
			//super.rightClick(); // super -> 부모클래스(부한테 다시 보내주는녀석)
			System.out.println("우 더블클릭");
		}


		//4. wheelmouse 만의 기능 추가
		public void wheel() {
			System.out.println("휠 사용하기~~");
		}


}
