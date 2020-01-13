/** child class (is-an Item), implements Comparable to sort
 * This class is for the item type Book that contains all its attributes
 */
import java.util.*;
public class Book extends Item implements Comparable<Book>
{
    private String author;      /**author of book**/
    private String title;       /**title of book**/
    private int year;           /**year book was made**/

    /**
     * overloaded constructor to set author, title, and year of book. Gets Title, price, and quantity from super class
     * @param Title
     * @param price
     * @param quantity
     * @param author
     * @param title
     * @param year
     */
    public Book(String Title, double price, int quantity, String author, String title, int year)
    {
        super(Title, price, quantity);
        this.author=author;
        this.title = title;
        this.year=year;
    }

    /**
     * This method adds the book to the inventory, getting information from the user (price, quantity, author, title, year)
     * @param inventory - linked list that contains inventory of items
     */
    public static void addBook(LinkedList<Item> inventory)
    {
        Scanner scanner = new Scanner(System.in);
        double price;
        int quantity, year;
        String author, title;
        System.out.print("Enter price: ");
        price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter author: ");
        author = scanner.nextLine();
        System.out.print("Enter title: ");
        title = scanner.nextLine();
        System.out.print("Enter year: ");
        year = scanner.nextInt();
        Book newBook = new Book("Book", price, quantity, author, title, year);    /**makes a new book with attributes entered by user**/
        inventory.add(newBook.getID(), newBook);  /**adds book to inventory**/
    }

    /**
     * This method displays the attributes of the book (implementing abstract method from base class)
     */
    public void Display()
    {
        System.out.format("\n%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s", "Item Title", "ID", "Price", "Quantity", "Author", "Title", "Year");
        System.out.format("\n%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s\t%10.10s", getTitle(), getID()+1, getPrice(), getQuan(), getAuthor(), gettitle(), getYear());
    }

    /**
     * Implements method compareTo to sort the books by author
     */
    public int compareTo(Book o)
    {
        return this.getAuthor().compareTo(o.getAuthor());
    }
    /**get methods**/
    public String getAuthor()
    {
        return author;
    }
    public String gettitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
}
