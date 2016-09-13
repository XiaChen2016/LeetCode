/*Question source & more solutions:
 * https://leetcode.com/articles/rotate-array/
 * */
import java.util.HashMap;
import java.util.Map;

public class RotateArray {
	
	public static void main( String []args ){
		int[] nums = {1,2,1,1,2,3};
		
		RotateArray r = new RotateArray();
		r.rotate(nums, 9);
	}
	
	 /*	 Solution 1  */
	 public void rotate(int[] nums, int k) {
		 int i,j;
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			// Store all elements into a hash map
			for( i=0; i<nums.length; i++ ) {
				map.put(i,nums[i]);
			}
		
			for(Map.Entry<Integer, Integer> entry : map.entrySet()){
				i = entry.getKey();
				j = entry.getValue();
				nums[ (i+k) % nums.length ] = j;
			}
			
		 for( i=0; i<nums.length; i++)
			 System.out.println(nums[i]);
	    }
	
	 
	 /*	 Solution 2   */
//	 public void rotate(int[] nums, int k) {
//		 if( nums.length<2 )
//			 return;
//		 if(nums.length<k)
//		 {
//			 rotate(nums, (k%nums.length));
//			 return;
//		 }
//	 
//	     int i;
//	     int j = nums.length-k;
//		 int[] temp = new int[k];
//		 for( i=0 ; i<k ; i++ ) {
//			 temp[ i ] = nums[ j+i ];
//		 }
//		 for( i = nums.length-1; i>=k; i-- ){
//			 nums[i] = nums[i-k];
//		 }
//		 for( i=0; i<k; i++ ){
//			 nums[i] = temp[i];
//		 }
//		 
//		 for( i=0; i<nums.length; i++)
//			 System.out.println(nums[i]);
//	    }
}
