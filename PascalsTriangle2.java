/* The question is from:
 * https://leetcode.com/problems/pascals-triangle-ii/
 * */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

	public static void main(String[] args) {
		PascalsTriangle2 r = new PascalsTriangle2();
		// Define rowIndex as 3
		r.getRow(3);
	}
	
	 public List<Integer> getRow(int rowIndex) {
		int i,j;
		List<Integer> row = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		
		if( rowIndex<0 ){
			return row;
		}
		
		row.add(1);
		
		for( i=1; i<=rowIndex; i++ ) {
			for( j=0; j<=i; j++ ){
				if( j==0 || j==i ) {
					temp.add(j, 1);
				} else {
					temp.add(j, row.get(j-1)+ row.get(j));
				}
			}
			row = temp;
			temp=new ArrayList<Integer>();
		}
		return row;
	 }
}
