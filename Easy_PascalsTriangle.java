/* This question is from:
 * https://leetcode.com/problems/pascals-triangle/
 * */
import java.util.ArrayList;
import java.util.List;

public class Easy_PascalsTriangle {
	
	public static void main(String[] args) {
		Easy_PascalsTriangle r = new Easy_PascalsTriangle();
		// Define numRows as 5
		r.generate(5);
	}
	
	public List<List<Integer>> generate(int numRows) {
		 int i,j;
			List<List<Integer>> list = new ArrayList<List<Integer>>();
			List<Integer> row = new ArrayList<Integer>();
			List<Integer> temp = new ArrayList<Integer>();

			if( numRows < 1 ){
				return list;
			}
			row.add(1);
			list.add(row);
			
			for( i=2; i<=numRows; i++ ) {
				for( j=0; j<i; j++ ){
					if( j==0 || j==i-1 ) {
						temp.add(j, 1);
					} else {
						temp.add(j, row.get(j-1)+ row.get(j));
					}
				}
				list.add(temp);
				row = temp;
				temp=new ArrayList<Integer>();
			}
			
			return list;
        
    }
}
