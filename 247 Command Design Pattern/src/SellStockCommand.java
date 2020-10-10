/**
 * 
 * @author carlosangeles
 *
 * This class sells the stocks
 */
public class SellStockCommand {

	StockTrade stockTrade;
	String stockName;
	int shares;
	
	/**
	 * Constructor constructs the stock to be sold
	 * @param stockTrade
	 * @param stockName
	 * @param shares
	 */
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares)
	{
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	
	/**
	 * Sells the stock
	 */
	public void execute()
	{
		stockTrade.sell(stockName, shares);
	}

}
