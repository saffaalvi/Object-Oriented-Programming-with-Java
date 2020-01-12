/** child class (is-an Item), implements Comparable to sort
 * This class is for the item type Shoe that contains all its attributes
 * November 20, 2019 - Assignment 2
 */
import java.util.*;
public class Shoe extends Item implements Comparable<Shoe>
{
    private String colour;      /**colour of shoe**/
    private double size;        /**size of shoe**/

    /**
     * overloaded constructor to set colour and size of shoe. Gets Title, price, and quantity from super class
     * @param Title
     * @param price
     * @param quantity
     * @param colour
     * @param size
     */
    public Shoe(String Title, double price, int quantity, String colour, double size)
    {
        super(Title, price, quantity);
        setColour(colour);
        this.size=size;
    }

    /**
     * This method adds the shoe to the inventory, getting information from the user (price, quantity, size, colour)
     * @param inventory - linked list that contains inventory of items
     */
    public static void addShoe(LinkedList<Item> inventory)
    {
        Scanner scanner = new Scanner(System.in);
        String colour;
        double size;;
        double price;
        int quantity;

        System.out.print("Enter price: ");
        price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Enter size: ");
        size = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter colour: ");
        colour = scanner.nextLine();
        Shoe newShoe = new Shoe("Shoe", price, quantity, colour, size);	/**makes a new shoe with attributes entered by user**/
        inventory.add(newShoe.getID(), newShoe);    /**adds shoe to inventory**/
    }

    /**
     * This method displays the attributes of the giftcard (implementing abstract method from base class)
     */
    public void Display()
    {
        System.out.format("\n%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s", "Item Title", "Id", "Price", "Quantity", "Colour", "Size");
        System.out.format("\n%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s", getTitle(), getID() + 1, getPrice(), getQuan(), getColour(), getSize());
    }

    /**
     * Implements method compareTo to sort the shoes by label
     */
    public int compareTo(Shoe o)
    {
        if(this.getSize()<o.getSize())
            return -1;
        else if (o.getSize()<this.getSize())
            return 1;
        return 0;
    }
    /**set method for Colour - must be one of the options listed or defaults to white**/
    public void setColour(String colour)
    {
        if (colour.equalsIgnoreCase("white")||colour.equalsIgnoreCase("silver")||colour.equalsIgnoreCase("red")||colour.equalsIgnoreCase("beige")||colour.equalsIgnoreCase("brown")||colour.equalsIgnoreCase("blue")||colour.equalsIgnoreCase("black")||colour.equalsIgnoreCase("pink"))
            this.colour=colour;
        else
            colour="white";
    }
    /**get methods**/
    public String getColour()
    {
        return colour;
    }
    public double getSize()
    {
        return size;
    }

}
