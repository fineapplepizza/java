
public class WheelMouse extends Mouse {
	//���� Mouse Ŭ������ ���Ͽ� ��� �����ޱ�! -> ����� �ޱ�
	
	//����� Ű���� -> extends(Ȯ���ϴ� �ǹ�)
	// ����� ���� -> �ڽ� Ŭ���� extends �θ� Ŭ����(�θ�κ��� Ȯ��Ǿ� �ִ� �ڽ� Ŭ���� �Դϴ�.)	

	//���콺�� ��� ����
	//�޼ҵ� �������̵�(�� ����)
//		//1. �θ� ������ �ִ� ����� ���׷��̵� �ؼ� ���� �� Ŭ�� 
		public void leftClick() {
			System.out.println("�� ����Ŭ��!!");
		}
		
		
//		//2. �� Ŭ�� �ϱ� �޼ҵ� -> rightClick()
//		public void rightClick() {
//			System.out.println("�� Ŭ��!!");
//		}
//		//3. �巡�� �ϱ� �޼ҵ�->drag
//		public void drag() {
//			System.out.println("�巡�� �ϱ�~");
//		}
		
		@Override
		public void rightClick() {
			//super.rightClick(); // super -> �θ�Ŭ����(������ �ٽ� �����ִ³༮)
			System.out.println("�� ����Ŭ��");
		}


		//4. wheelmouse ���� ��� �߰�
		public void wheel() {
			System.out.println("�� ����ϱ�~~");
		}


}
