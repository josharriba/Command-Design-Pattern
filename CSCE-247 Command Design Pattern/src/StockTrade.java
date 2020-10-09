/**
 * 
 * @author OwenB
 * @author Miles Colbert
 *
 */
public class StockTrade {
	
	public StockTrade() {
		
	}
	
	/**
	 * Method to display how many and of what stock is being purchased.
	 * @param stockName
	 * @param numShares
	 */
	public void buy(String stockName, int numShares) {
		System.out.println("Buying " + numShares + " of " + stockName);
	}
	
	/**
	 * Method to display how many and of what stock is being sold.
	 * @param stockName
	 * @param numShares
	 */
	public void sell(String stockName, int numShares) {
		System.out.println("Selling " + numShares + " of " + stockName);
	}
}
