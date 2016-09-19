/* This question is from: 
 * https://leetcode.com/problems/rotate-function/
 * */
public class Easy_RotateFunction {
	
	public static void main(String []args) {
		int[] A = {1,2,3};
		Easy_RotateFunction r = new Easy_RotateFunction();
		System.out.println(r.maxRotateFunction(A));
	}
	
	/* After analysis, we have F(k) = F(k-1) + sum - nBk[0], with which the question would be simpler. */
	 public int maxRotateFunction(int[] A) {
		 int i, F0=0, sum=0, max;
		 int len = A.length;
		 for( i=0; i < len; i++ ){
			 F0 += i*A[i];
			 sum += A[i];
		 }
		 max = F0;
		 for( i=1; i < len; i++ ) {
			 F0 = F0 + sum - len*A[( len-i) % len];
			 max = Math.max(F0, max);
		 }
		 return max;
	    }
	 
	 /*  Solution 2 ( Time limited exeeded, not a good solution ):  */
//	 public int maxRotateFunction(int[] A) {
//		 if( A.length==0 )
//			 return 0;
//		 boolean maxExists = false;
//	     int i,j,max=0;
//	     int len = A.length;
//	     int[] FArray = new int[len];
//	     for( i=0; i<len; i++ ) {
//	    	 for( j=0; j<len; j++ ) {
//	    		 FArray[i] += ( A[j] * ((i+j)%len) );
//	    	 }
//	    	 if(maxExists) {
//    			 max = max > FArray[i] ? max : FArray[i];
//    		 }
//    		 else{
//    			 maxExists = true;
//    			 max = FArray[i] ;
//    		 }
//	     }
//		 return max;
//	    }
}
