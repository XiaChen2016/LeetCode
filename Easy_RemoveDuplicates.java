/* Source address:
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Similar question: Remove Element ( https://leetcode.com/problems/remove-element/ )
 * */
public class Easy_RemoveDuplicates {
	
	public static void main( String []args ) {
		// Define an array
		int[] nums = {1,2,2,3};	
		Easy_RemoveDuplicates r = new Easy_RemoveDuplicates();
		System.out.println( r.removeDuplicates(nums) );
	}
	
	 public int removeDuplicates(int[] nums) {
		 /*
		  * We use two pointer,
		  * So it will return the length for arrays with only one elements or less. 
		  * */
		 if( nums.length < 2 ){
			 return nums.length;
		 }
		 int i = 0;
		 for( int j = 1; j < nums.length ; j++ ) {
			 if( nums[i] != nums[j] ) {
				 nums[++i] = nums[j];
			 }
		 }
	     return ++i;
	    }
}
