/* Source of the question:
 * https://leetcode.com/problems/contains-duplicate/
 * 
 * This question is similar to "Two Sum":
 * https://leetcode.com/problems/two-sum/
 * */
import java.util.HashMap;

public class Easy_ContainsDuplicate {
	
	public static void main (String []args) {
		int[] nums = {1,2,3,12,31,1};
		Easy_ContainsDuplicate e = new Easy_ContainsDuplicate();
		e.containsDuplicate(nums);
	}
	
    public boolean containsDuplicate(int[] nums) {
    	if( nums.length<2 ) {
    		return false;
    	}
		int i;
		HashMap<Integer,Integer> map = new HashMap<>();
		// Store all elements into a hash map
		for( i=0; i<nums.length; i++ ) {
			map.put(nums[i],i);
		}
		for( i = 0; i<nums.length; i++ ){
			if( map.containsKey(nums[i]) && map.get(nums[i]) != i ){
				return true;
			}
		}   
		return false;
    }
}
