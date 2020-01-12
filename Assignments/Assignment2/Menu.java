/**
 * This class maintains a list of items entered by the user by means of an interactive menu
 * November 20, 2019 - Assignment 2
 */
import java.util.*;
public class Menu
{
    static LinkedList<Item> inventory = new LinkedList<Item>();     /**linked list for inventory entered by user**/
    /**main method**/
    public static void main(String[] args)
    {
        int end=1;          /**break loop when end=0 (user enters 8)**/
        int option;         /**option selected from menu by user**/
        String type;        /**type of item to add to inventory**/
        Scanner scanner = new Scanner(System.in);
        while (end==1)
        {
            System.out.print("\n1 - Add item to the inventory\n2 - Display all inventory\n3 - Display only books sorted by author name\n4 - Display only gift cards sorted by label\n5 - Display only shoes sorted by size\n6 - Delete an item by ID\n7 - Purchase an item\n8 - Exit\n");
            option = scanner.nextInt();
            scanner.nextLine();
            switch(option)          /**switch cases depending on which option is selected from menu**/
            {
                case 1:             /**add an item to the inventory**/
                    System.out.print("Enter Book or GiftCard or Shoe\n");
                    type=scanner.nextLine();
                    if (type.equalsIgnoreCase("Book"))              /**add book**/
                    {
                        Book.addBook(inventory);
                        break;
                    }
                    else if (type.equalsIgnoreCase("GiftCard"))     /**add giftcard**/
                    {
                        GiftCard.addGC(inventory);
                        break;
                    }
                    else if (type.equalsIgnoreCase("Shoe"))         /**add shoe**/
                    {
                        Shoe.addShoe(inventory);
                        break;
                    }
                    else            /**invalid**/
                    {
                        System.out.println("NOT AN OPTION.");
                        break;
                    }

                case 2:     /**display all items in inventory**/
                    System.out.println("DISPLAY ALL ITEMS IN INVENTORY: ");
                    for (Item i: inventory)
                    {
                       i.Display();
                    }
                    break;

                case 3:     /**display books sorted by author**/
                    System.out.println("BOOK LIST SORTED BY AUTHOR: ");
                    LinkedList<Book> booklist = new LinkedList<Book>(); /**new linked list that only contains books**/
                    for (Item i: inventory)
                    {
                        if (i.Title.equalsIgnoreCase("book")) {
                            booklist.add((Book) inventory.get(inventory.indexOf(i)));   /**add each book in inventory to booklist**/
                        }
                    }
                    Collections.sort(booklist);     /**sorts booklist by author**/
                    for (Book b: booklist)          /**displays sorted booklist**/
                    {
                        b.Display();
                    }
                    break;

                case 4:   /**display giftcards sorted by label**/
                    System.out.println("GIFTCARD LIST SORTED BY LABEL: ");
                    LinkedList<GiftCard> gclist = new LinkedList<GiftCard>();       /**new linked list that only contains giftcards**/
                    for (Item i: inventory)
                    {
                        if (i.Title.equalsIgnoreCase("GiftCard")) {
                            gclist.add((GiftCard) inventory.get(inventory.indexOf(i))); /**add each giftcard in inventory to gclist**/
                        }
                    }
                    Collections.sort(gclist);   /**sorts gclist by label**/
                    for (GiftCard g: gclist)    /**displays sorted gclist**/
                    {
                        g.Display();
                    }
                    break;

                case 5: /**display shoe list sorted by size**/
                    System.out.println("SHOE LIST SORTED BY SIZE: ");
                    LinkedList<Shoe> shoelist = new LinkedList<Shoe>();     /**new linked list for only shoes**/
                    for (Item i: inventory)
                    {
                        if (i.Title.equalsIgnoreCase("shoe")) {
                            shoelist.add((Shoe) inventory.get(inventory.indexOf(i)));   /**add each shoe in inventory to shoelist**/
                        }
                    }
                    Collections.sort(shoelist);     /**sorts shoelist**/
                    for (Shoe s: shoelist)          /**displays sorted shoelist**/
                    {
                        s.Display();
                    }
                    break;

                case 6: /**delete an item by ID**/
                    System.out.print("Enter ID of item you want to delete: ");
                    int del = scanner.nextInt();           /**ID of item that should be deleted**/
                    inventory.remove(del-1);        /**removes item at correct index (del-1 because ID starts at 1 but index starts at 0)**/
                    System.out.println("SUCCESSFULLY DELETED ITEM FROM INVENTORY!");
                    break;

                case 7: /**purchase an item**/
                    System.out.print("Enter ID of item you want to purchase: ");
                    int pur = scanner.nextInt();        /**id of item wanting to be purchased**/
                    System.out.print("Enter quantity of item you want to purchase: ");
                    int purQuan = scanner.nextInt();        /**quantity of item to be purchased**/
                    inventory.get(pur-1).Purchase(purQuan); /**gets item to be purchased and removes quantity**/
                    System.out.println("SUCCESSFULLY PURCHASED ITEM");
                    break;

                case 8: /**exit**/
                    end = 0;
                    System.out.println("GOODBYE!");
                    break;

                default:
                    System.out.println("NOT AN OPTION. TRY AGAIN!");
                    break;

            }
        }

    }


}
