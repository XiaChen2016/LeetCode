/* The source of question is:
 * https://leetcode.com/problems/move-zeroes/
 * */
public class Easy_MoveZeros {

	public static void main( String []args ) {
		int[] nums = { 0,1,0,3,12 };
		Easy_MoveZeros m = new Easy_MoveZeros();
		m.moveZeroes(nums);
	}
	
	public void moveZeroes(int[] nums) {
	    int i=0;
	    int j,temp;
	    while( i<nums.length ) {
	    	if( nums[i] != 0 ) {
	    		i++;
	    		continue;
	    	} else {
	    		j=i+1;
	    		// j points at the first non-zero number after zero
	    		while( j<nums.length && nums[j] ==0 ) {
	    			j++;
	    		}
	    		if( j<nums.length ) {
		    		nums[i] = nums[j];
		    		nums[j] = 0;
		    		} else 
		    			break;
	    		
	    	}
	    } 
	}
	/* Solution 2 */
//	public void moveZeroes(int[] nums){
//		int index=0;
//		for (int i=0;i<nums.length;i++){
//			if (nums[i]!=0) nums[index++]=nums[i];
//		}
//		while(index<nums.length){
//			nums[index++]=0;
//		}
//	}

}
