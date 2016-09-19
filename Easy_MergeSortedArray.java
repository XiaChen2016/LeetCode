/* Source of the question:
 * https://leetcode.com/problems/merge-sorted-array/
 * */
public class Easy_MergeSortedArray {
	public static void main( String []  args ) {
		// Define array1 and array2
		int[] array1 = new int[3];
		array1[0]=1;
		array1[1]=4;
		int[] array2 = {2};
		Easy_MergeSortedArray m = new Easy_MergeSortedArray();
		
 		m.merge(array1, 2, array2, 1);
	}
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 int i = m-1;
		 int j = n-1;
		 int k = m+n-1;
		
		 while( i>-1 && j>-1 ) 
			 nums1[k--] = (nums1[i]>nums2[j]) ? nums1[i--]:nums2[j--];
		 
		 while( j>-1 ) 
			 nums1[k--] = nums2[j--];
		 
		 for( i=0; i< nums1.length; i++ ){
			 System.out.println(nums1[i]);
		 }
	 }
}
