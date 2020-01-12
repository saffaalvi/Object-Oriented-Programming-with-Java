public class Invoice {
	private Item[] item; /**Item array that contains information of each item such as name, quantity, and price**/
	private int index;	/**index of invoice**/
	private int numItems;	/**number of items in invoice**/
  
	/**This method sets numItems to the number of items in the invoice. It then adds an item to the array Item and sets the index of the array to 0*
	 * @param numItems - integer number of items
	 * no return value
	 * */
	public Invoice (int n)
	{
		numItems = n;	/**sets numItems to the number of items in the invoice**/
		item = new Item[100]; /**creates a new array object in Item**/
		index=0;		/**sets index of array to 0**/
	}
  
	/**This method adds the item to the correct index in the array item
	 * @param i - information about item of type Item
	 * no return value
	 */
	public void newItem(Item i)
	{
		item[index++]=i;	/**increments the index for the next item**/
	}
  
	/**This method gets the subtotal of the items
	 * no parameters
	 * @return subtotal - double 
	 */
	public double getSubtotal()
	{
		double subtotal = 0;		/**subtotal of items**/
		for(int i=0; i<index; i++)  /**loop to go through each item in the invoice**/
			subtotal+=item[i].getTotal();	/**adds total of each item into the subtotal**/
		return subtotal;
	}
  
	/**This method calculates the tax to be added to the subtotal by multiplying the return from getSubtotal() by 0.0625
	 * no parameters
	 * @return amount of tax to be added to subtotal
	 */
	public double calcTax()
	{
		return 0.0625*getSubtotal();
	}
  
	/** This method calculates the new total with tax added by adding the return from getSubtotal() and calcTax()
	 * no parameters
	 * @return total with tax
	 */
	public double getTaxTotal()
	{
		return getSubtotal()+calcTax();	
	}
  
	/**This method prints the final invoice
	 * no parameters
	 * no return value 
	 */
	public void printInvoice()
	{
		System.out.println("Your bill:");
		System.out.printf("%-30s\t%-10s\t%-10s\t%-10s\n", "Item", "Quantity", "Price", "Total");	/**30 characters for the item, 10 characters each for the quantity, price and total**/
		for (int i=0; i<numItems; i++)
		{
			System.out.printf("%-30s\t%-10d\t%-10.2f\t%-10.2f\n", item[i].getName(), item[i].getQuant(), item[i].getPrice(), item[i].getTotal()); /** prints out infor for each item, formatted to the correct number of characters and spacing**/
			
		}
		System.out.printf("\nSubtotal\t\t\t\t\t\t\t%.2f", getSubtotal());	/**prints subtotal of items, rounded to two decimal places**/
		System.out.printf("\n6.25%% Tax\t\t\t\t\t\t\t%.2f", calcTax());		/**prints tax of items, rounded to two decimal places**/
		System.out.printf("\nTotal\t\t\t\t\t\t\t\t%.2f\n", getTaxTotal());    /**prints total of items, rounded to two decimal places**/

		
	}
}
