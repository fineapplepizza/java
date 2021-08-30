
public class ex03별찍기 {

	public static void main(String[] args) {
		
		//바깥쪽 for문
		for(int i = 1 ; i <= 5 ; i++) {
			
			//안쪽 for문
			for(int j = 5; j>0 ; j--) {
				
				if(i<j) {
		
				System.out.print(" ");
				}else {
				System.out.print("*");
				}
			}
			System.out.println();
			
		}

	}

}
