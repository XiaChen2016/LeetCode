/* Source of the question:
 * https://leetcode.com/problems/majority-element/
 * */
import java.util.HashMap;

public class Easy_MajorityElement {
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,4,2,4,2};
		Easy_MajorityElement e = new Easy_MajorityElement();
		System.out.println(e.majorityElement(nums));
	}

    public int majorityElement(int[] nums) {
    	if( nums.length<2 ) 
    		return nums[0];
    	int i,j;
    	HashMap<Integer,Integer> map = new HashMap<>();
		// compare elements with those which are stored before them, then add them into a hash map.
    	for( i=0; i<nums.length; i++) {
    		if( map.containsKey(nums[i]) ){
    			j = map.get(nums[i]).intValue();
    			map.remove(nums[i], j);
    			map.put(nums[i], ++j);
    			if( j> nums.length/2)
    				return nums[i];
    			
    		}
    		else
    			map.put(nums[i],1);
    	}
    	return 0;
    }
}
