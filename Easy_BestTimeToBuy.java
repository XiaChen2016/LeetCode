/* Source of the question:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * */
public class Easy_BestTimeToBuy {
	
	public static void main(String []args ) {
		// Define the array of prices
		int[] prices = {7,1,5,3,6,4};
		Easy_BestTimeToBuy e = new Easy_BestTimeToBuy();
		System.out.println(e.maxProfit(prices));
	}
	
    public int maxProfit(int[] prices) {
    	
    	if( prices.length<2 ) {
    		return 0;
    	}
    	int i;
    	int min = prices[0];
    	int profit = 0;
    	for( i=1; i<prices.length; i++ ) {
    		if( prices[i] < min)
    			min = prices[i];
    		profit = Math.max(profit, prices[i] - min );
    	}
    	
    	return profit;
    }
}
