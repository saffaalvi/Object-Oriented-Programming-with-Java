public abstract class Item
{
    private static int count = 0;   //number of items in inventory

    private int item_id=0;          //unique id of item
    private double price;           //price of item
    private int quantity;           //quantity of item
    protected String Title;         //item type

    /**
     * overloaded constructor to set id, Title, price, and quantity of item
     * @param Title - type of item (book, giftcard, or shoe)
     * @param price - price of item
     * @param quantity - quantity of item
     */
    public Item(String Title, double price, int quantity)
    {
        this.item_id = count++;
        setTitle(Title);
        setPrice(price);
        setQuan(quantity);
    }
    /**abstract method for child classes to implement**/
    public abstract void Display();

    /**this method removes the given quantity (num) of the item from the inventory**/
    public void Purchase(int num)
    {
        if (num <= this.getQuan())          /**will only remove from quantity if it is valid (quantity will not be negative**/
        {
            this.setQuan(this.getQuan()-num);
        }
    }

    /**set methods (checking valid inputs or setting to defaults)**/
    public static void setCount(int count)
    {
        Item.count=count;
    }
    public void setID(int item_id)
    {
        this.item_id = item_id;
    }
    public void setTitle(String Title)
    {
        /**Title cannot be empty, if it is, defaults to Book type**/
        if(Title.isEmpty())
            this.Title = "Book";
        else
            this.Title=Title;
    }
    public void setPrice(double price)
    {
        /**price must be 0 or positive. If not, defaults to 1**/
        if(price<0)
            price = 1;
        else
            this.price=price;
    }
    public void setQuan(int quantity)
    {
        /**quantity must be 0 or positive. If not, defaults to 1**/
        if(quantity<0)
            quantity = 1;
        else
            this.quantity=quantity;
    }

    /**get methods**/
    public String getTitle()
    {
        return Title;
    }
    public int getID()
    {
        return item_id;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuan()
    {
        return quantity;
    }

}
