
public class Item {
	private String name;	/**name of item**/
	private int quantity;	/**quantity of item**/
	private double price;	/**price of item**/
	
	/**This method sets the name, quantity, and price of the item to those entered
	 * @param n - String name
	 * @param q - int quantity
	 * @param p - double price
	 * no return value
	 */
	public Item(String n, int q, double p)
	{
		this.name = n;
		this.quantity = q;
		this.price = p;
	}
  
	/**This method gets the name of the item
	 * no input 
	 * @return name 
	 */
	public String getName()
	{
		return name;
	}
  
	/**This method gets the quantity of the item
	 * no input 
	 * @return quantity 
	 */
	public int getQuant()
	{
		return quantity;
	}
  
	/**This method gets the price of the item
	 * no input 
	 * @return price 
	 */
	public double getPrice()
	{
		return price;
	}
  
	/**This method gets the total of the item
	 * no input 
	 * @return total 
	 */
	public double getTotal()
	{
		return (double)(price*quantity);
	}
}
