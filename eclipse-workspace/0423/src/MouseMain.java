
public class MouseMain {

	public static void main(String[] args) {
		
		// 상속의 특징!
		// 1. 다중상속이 불가능하다
		// 2. 상속의 횟수에는 제한이 없다
		// 3. 모든 클래스는 Object 클래스를 상속 받는다.
		
		
		// Mouse (기본 마우스) 클래스 불러오기! -> 객체 생성
		Mouse m = new Mouse();
		m.rightClick(); //"좌 클릭"
		m.leftClick();
//		m.drag();
		
		System.out.println();
		
		// WheelMouse 객체 생성!
		WheelMouse wm = new WheelMouse();
		wm.leftClick();  // " 좌 더블클릭"
		wm.rightClick();
//		wm.drag();
		wm.wheel();
		
		System.out.println();
		
		// SmartMouse 객체 생성!
		SmartMouse sm = new SmartMouse();
		sm.leftClick();
		sm.rightClick();
//		sm.drag();
		sm.wheel();
		sm.smart();

	}

}
