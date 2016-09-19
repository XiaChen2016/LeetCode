/* This question if from:
 * https://leetcode.com/problems/two-sum/
 * Time complexity : O(n)
 * */

import java.util.HashMap;

public class Easy_TwoSum {
	
	public static void main( String []args ) {
		// Define an array and display the result array on console
		int[] nums = {0,4,3,-3};
		int[] ret = new int[2];

		Easy_TwoSum t = new Easy_TwoSum();
		ret = t.twoSum( nums,0 );
		for( int i=0; i < ret.length; i++)
			System.out.println( ret[i] );
	}
	public int[] twoSum(int[] nums, int target) {
		int i;
		HashMap<Integer,Integer> map = new HashMap<>();
		// Store all elements into a hash map
		for( i=0; i<nums.length; i++ ) {
			map.put(nums[i],i);
		}
		for( i = 0; i<nums.length; i++ ){
			int difference = target - nums[i];
			if( map.containsKey(difference) && map.get(difference) != i ){
				return new int[] { i, map.get(difference) };
			}
		}
		throw new IllegalArgumentException("No solution");
	}
}
