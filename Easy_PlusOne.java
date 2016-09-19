/* The source of question:
 * https://leetcode.com/problems/plus-one/
 * */
public class Easy_PlusOne {
	
	public static void main( String[] args ) {
		Easy_PlusOne p = new Easy_PlusOne();
		// Define a number represented as an array of digits 
		int[] digits = {1,2,3,1,2};
		// Get the new number
		int[] array = p.plusOne(digits);
		for( int i=0; i< array.length; i++ )
			System.out.print(array[i]);
		
	}
    public int[] plusOne(int[] digits) {
        int i;
        for( i=digits.length-1 ; i>=0; i-- ) {
        	if( digits[i] < 9 ) {
        		digits[i] ++;
        		return digits;
        	}
        	digits[i] = 0;
        }
        int[] array = new int[digits.length+1];
        array[0] = 1;
        return array;
    }
}
