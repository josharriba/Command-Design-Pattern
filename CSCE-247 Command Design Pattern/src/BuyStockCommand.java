/**
 * The BuyStockCommand class buys the stocks
 * @author joshj
 *
 */
public class BuyStockCommand implements Command{

    /**
     * variables
     */
    StockTrade stockTrade;
    String stockName;
    int shares;

    /**
     * constructor sets attributes
     * @param stockTrade
     * @param stockName
     * @param shares
     */
    public BuyStockCommand(StockTrade stockTrade, String stockName, int shares) {
        this.stockTrade = stockTrade;
        this.stockName = stockName;
        this.shares = shares;
    }

    /**
     * the exceute method calls the buy method
     */
    public void execute() {
        stockTrade.buy(stockName, shares);
    }
}