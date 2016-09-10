/* Source address:
 * https://leetcode.com/problems/remove-element/
 * The submission result of this answer is Accepted.
 * */

public class RemoveElement {
	
	public static void main( String[] args) {
		RemoveElement r = new RemoveElement();
		int[] array = {4,4,5};
		System.out.println(r.removeElement( array, 5 ));
	}
	
	 public int removeElement(int[] nums, int val) {
		 /* Two pointers would be used to solve this problem,
		  * The case that there is only one element in the array should be discussed alone.
		 */
		 if( nums.length==1){
			 if( nums[0]==val)
				 return 0;
			 else
				 return 1;
		 }
		 else{
			int i=0;
			int j = nums.length-1;
			
			while( i<j ){
				
				while( j>=0 && nums[j] == val ){
					j--; 
				}
				
				while ( nums[i] != val && i<nums.length-1 ){
					i++;
				}
				/* Now number i is the target value, and j is not.
				 * Assign the value of j to i  
				 * */
				if( i<j )
				{
					nums[i] = nums[j];
					i++;
					j--;
				}
			}
			
			if( i==j )
				if( nums[i] == val)
					return j;
	        return ++j;
		 }
	    }
	 
	 
	}