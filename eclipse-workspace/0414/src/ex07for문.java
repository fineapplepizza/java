
public class ex07for�� {

	public static void main(String[] args) {
		
		// 21~57���� ���

		for(int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 96~53���� ���

		for(int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 21~57���� ���
		
//		for(int i = 21; i <= 57; i++) {
//			//Ȧ�� �Ǵ�
//			if(i%2==1) {
//				System.out.print(i + " ");
//			}
			
		for(int i =21; i <= 57 ; i+=2) {
			System.out.print(i + " ");
			
		}

		System.out.println();

		int hap = 0;
		// 1~100 3�� ����� ���� �������� ����ϱ�!
		for(int i = 1 ; i<= 100 ; i++ ) {
			if(i%3==0) {
				// �ش��ϴ� i���� �����ϱ�
			hap+=i ;
			}
		}
		System.out.print("3�� ����� ���� ��: " + hap);
		

	}

}
