
public class MouseMain {

	public static void main(String[] args) {
		
		// ����� Ư¡!
		// 1. ���߻���� �Ұ����ϴ�
		// 2. ����� Ƚ������ ������ ����
		// 3. ��� Ŭ������ Object Ŭ������ ��� �޴´�.
		
		
		// Mouse (�⺻ ���콺) Ŭ���� �ҷ�����! -> ��ü ����
		Mouse m = new Mouse();
		m.rightClick(); //"�� Ŭ��"
		m.leftClick();
//		m.drag();
		
		System.out.println();
		
		// WheelMouse ��ü ����!
		WheelMouse wm = new WheelMouse();
		wm.leftClick();  // " �� ����Ŭ��"
		wm.rightClick();
//		wm.drag();
		wm.wheel();
		
		System.out.println();
		
		// SmartMouse ��ü ����!
		SmartMouse sm = new SmartMouse();
		sm.leftClick();
		sm.rightClick();
//		sm.drag();
		sm.wheel();
		sm.smart();

	}

}
