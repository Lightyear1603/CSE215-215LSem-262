package labquizsol1;

public class labquizsol0103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int slicenum=1;
		
		int[][][] arr = {
        		{{1,2,3},{4,5,6},{7,8,9}},
        		{{10,11,12},{13,14,15},{16,17,18}},
        		{{19,20,21},{22,23,24},{25,26,27}}	
        };
        
        int sum1=0;
        int sum2=0;
        int sum3=0;
        
        for (int[][] slice: arr) {
        	int sum = 0;
        	
        	for(int[] row : slice) {
        		for(int num : row) {
        			sum = sum+num;
        		}
        		
        	}
        	System.out.println("The sum of "+slicenum+" "+"is:"+sum);
        	slicenum++;
        }
	
	
	}
	
	

}
