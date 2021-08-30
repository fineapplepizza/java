package 알고리즘문제최종;

public class 아래와같이1차원배열거리 {

	public static void main(String[] args) {
      int[]point = {92,32,52,9,81,2,68};
      int min = (int)Math.abs(point[0]+point[1]);
      int[]last_min = new int [2];
      for(int i=0; i<point.length;i++) {
    	  for(int j=1;j<point.length;j++) {
    		  if(i!=j) {
    			  if(min>Math.abs(point[i]-point[j])) {
    				  min = Math.abs(point[i]-point[j]);
    				  
    				  last_min[0] = point[i];
    				  last_min[1] = point[j];
    			  }
    		  }
    	  }
    	  System.out.println("result ["+last_min[0]+","+last_min[1]+"]");
      }
	}

}
