/** child class (is-an Item), implements Comparable to sort
 * This class is for the item type GiftCard that contains all its attributes
 * November 20, 2019 - Assignment 2
 */
import java.util.*;
public class GiftCard extends Item implements Comparable<GiftCard>
{
    private String label;           /**label of giftcard**/
    private String manufacturer;    /**manufacturer of giftcard**/
    /**
     * overloaded constructor to set label and manufacturer of giftcard. Gets Title, price, and quantity from super class
     * @param Title
     * @param price
     * @param quantity
     * @param label
     * @param manufacturer
     */
    public GiftCard(String Title, double price, int quantity, String label, String manufacturer)
    {
        super(Title, price, quantity);
        this.label=label;
        this.manufacturer=manufacturer;
    }

    /**
     * This method adds the giftcard to the inventory, getting information from the user (price, quantity, label, manufacturer)
     * @param inventory - linked list that contains inventory of items
     */
    public static void addGC(LinkedList<Item> inventory)
    {
        Scanner scanner = new Scanner(System.in);
        String label, manufacturer;
        double price;
        int quantity;

        System.out.print("Enter price: ");
        price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter label: ");
        label = scanner.nextLine();
        System.out.print("Enter manufacturer: ");
        manufacturer = scanner.nextLine();
        GiftCard newGC = new GiftCard("GiftCard", price, quantity, label, manufacturer);	/**makes a new giftcard with attributes entered by user**/
        inventory.add(newGC.getID(), newGC);    /**adds giftcard to inventory**/
    }

    /**
     * This method displays the attributes of the giftcard (implementing abstract method from base class)
     */
    public void Display()
    {
        System.out.format("\n%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.12s", "Item Title", "Id", "Price", "Quantity", "Label", "Manufacturer");
        System.out.format("\n%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.12s", getTitle(), getID() + 1, getPrice(), getQuan(), getLabel(), getManu());
    }

    /**
     * Implements method compareTo to sort the giftcards by label
     */
    public int compareTo(GiftCard o)
    {
        return this.getLabel().compareTo(o.getLabel());
    }

    /**get methods**/
    public String getLabel()
    {
        return label;
    }
    public String getManu()
    {
        return manufacturer;
    }

}
