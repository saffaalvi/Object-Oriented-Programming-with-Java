/**COMP2120 - Lab 2**/
import java.util.*;
import java.lang.String;

public class CashRegister {
	/**Contains the main method that prompts the user to enter the inputs of the items
	 *@param args - array of strings
	 *no return value (void)
	 */
   
	public static void main(String[] args) {
		Invoice invoice = new Invoice(3);	/**instantiates an Invoice and the invoice instantiates an array of size 3**/
		Scanner sc = new Scanner(System.in);	/**declaring a variable of type Scanner, named sc, instantiating sc, it's now a scanner object**/
		for (int i=0; i<3; i++)
		{
			System.out.printf("Input name of item %d: ", (i+1));
			String name = sc.nextLine();		/**name of item**/
			System.out.printf("Input quantity of item %d: ", (i+1));
			int quantity = sc.nextInt();	   /**quantity of item**/
			System.out.printf("Input price of item %d: ", (i+1));
			double price = sc.nextDouble();   /**price of item**/
			invoice.newItem(new Item(name, quantity, price));  	/**adds a new item to the invoice**/
			sc.nextLine();		/**adds a new line**/
		}
		invoice.printInvoice();	/**prints the final invoice**/
	}

}
