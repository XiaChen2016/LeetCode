import java.util.HashMap;

/* Source of the question is:
 * https://leetcode.com/problems/contains-duplicate-ii/
 * */
public class Easy_ContainsDuplicate2 {

	public static void main (String []args) {
		int[] nums = {2,1,23,11,23,5,22,1};
		Easy_ContainsDuplicate2 e = new Easy_ContainsDuplicate2();
		System.out.println(e.containsNearbyDuplicate(nums, 2));
	}
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i;
    	if( nums.length<2 ) {
    		return false;
    	}
		HashMap<Integer,Integer> map = new HashMap<>();
		// compare elements with those which are stored before them, then add them into a hash map.
		for( i=0; i<nums.length; i++ ) {
			// If find the answer, return true
			if( map.containsKey(nums[i]) && i-map.get(nums[i]).intValue()<=k)
				return true;
			map.put(nums[i],i);
		}
    	return false;
    }
}
