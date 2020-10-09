/**
 * The Agent class hold all of the orders
 */
import java.util.ArrayList;

public class Agent {

	/**
	 * variable
	 */
	private ArrayList<Command> orders;
	
	/**
	 * constructor initializes ArrayList
	 */
	public Agent() {
		orders = new ArrayList<Command>();
	}
	
	/**
	 * The placeOrder method adds the command to the ArrayList of orders
	 * @param command
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}
	
	/**
	 * the processOrders method loops through the list of and executes each one
	 */
	public void processOrders() {
		for(int i = 0; i < orders.size(); i++) {
			orders.execute();
		}
	}
}