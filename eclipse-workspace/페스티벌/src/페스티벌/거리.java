package �佺Ƽ��;

public class �Ÿ� {

	public static void main(String[] args) {
		//1���� �迭
		int[]point = {92,32,52,9,81,2,68};
		int min = (int)Math.abs(point[0]-point[1]);
		int first =0;
		int second =0;
		for(int i=0;i<point.length;i++) {
			for(int j=0;j<point.length;j++) {
				if(i !=j) {
					if(min>Math.abs(point[i]-point[j])) {
						min = Math.abs(point[i]-point[j]);
						first = i;
						second =j;
					}
				}
			}
			
		}
		System.out.println("result = ["+first+","+second+"]");

	}

}
