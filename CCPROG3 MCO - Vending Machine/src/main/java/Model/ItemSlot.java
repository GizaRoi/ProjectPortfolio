package Model;
public class ItemSlot 
{
    private int capacity = 10;
    private String itemName = "<Empty>";
    private int itemPrice = 0;
    private int itemCal = 0;
    private int itemAmt = -1;
    private boolean isExclusive = true;
    private boolean isNecessary = false;
    private String action;

    /**
     * makes an instance of an item slot with default values
     */
    public ItemSlot()
    {}
    
    /**
     * makes an instance of an item slot with custom attributes
     * @param itemName the name of the item in the item slot
     * @param itemPrice how much the item costs
     * @param itemCal the amount of calories in an item
     * @param itemAmt the starting number of the item inside the slot
     */
    public ItemSlot(String itemName, int itemPrice, int itemCal, int itemAmt)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCal = itemCal;
        this.itemAmt = itemAmt;
    }
    
    public ItemSlot(String itemName, int itemPrice, int itemCal, int itemAmt, String action, boolean isExclusive, boolean isNecessary)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCal = itemCal;
        this.itemAmt = itemAmt;
        this.action = action;
        this.isExclusive = isExclusive;
        this.isNecessary = isNecessary;
    }

    /**
     * returns the capacity of the item slot
     * @return capacity of the item slot
     */
    public int getCapacity()
    {
        return this.capacity;
    }

    /**
    * returns the name of the item in the slot
    * @return name of item in the slot
    */
    public String getItemName()
    {
        return this.itemName;
    }

    /**
    * returns the price of the item
    * @return price of the item
    */
    public int getItemPrice()
    {
        return this.itemPrice;
    }

    /**
    * returns the calories present in the item
    * @return calories present in the item
    */
    public int getItemCal()
    {
        return this.itemCal;
    }

    /**
    * returns the amount of items in the slot
    * @return amount of items in the slot
    */
    public int getItemAmt()
    {
        return this.itemAmt;
    }
    
    public String getAction()
    {
        return this.action;
    }
    
    public boolean getExclusive()
    {
        return this.isExclusive;
    }
    
    public boolean getNecessary()
    {
        return this.isNecessary;
    }
    
    public void setExclusive(boolean b)
    {
        this.isExclusive = b;
    }
    
    public void setNecessary(boolean b)
    {
        this.isNecessary = b;
    }
    
    public void setAction(String text)
    {
        this.action = text;
    }

    /**
    * returns the price of the item
    * @return the price of the item
    */
    public void setItemPrice(int price)
    {
        if(price > 0)
        {
            this.itemPrice = price;
        }
    }

    /**
    * sets the item name for the slot
    * @param itemName name of item in the slot
    */
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    /**
    * sets the amount of calories in the item
    * @param itemCal calories present in the item
    */
    public void setItemCal(int itemCal)
    {
        this.itemCal = itemCal;
    }

    /**
    * sets the amount of items in the slot
    * @param itemAmt number of items in the slot
    */
    public void setItemAmt (int itemAmt)
    {
        int temp = this.itemAmt;
        this.itemAmt = itemAmt;
        if(this.itemAmt <= 0)
        {
            this.itemAmt = 0;
        }
        else if (this.itemAmt > 20)
        {
            this.itemAmt = temp;
            System.out.println("Item slot capacity exceeded. Please try again.");
        }
    }

    /**
    * clears all attributes of the slot
    */
    public void clearItemSlot()
    {
        this.itemName = "<Empty>";
        this.itemPrice = 0;
        this.itemCal = 0;
        this.itemAmt = -1;
    }

    /**
    * adds a number of items into the slot
    * @param n number of items to be added in the slot
    */
    public void restockItem(int n)
    {
        if((this.itemAmt + n) > this.capacity)
        {
            System.out.println("Restocking exceeded item slot capacity. Please try again.");
        }
        else
        {
            this.itemAmt += n;
        }
    }

    /**
    * subtracts one number of the item in the slot if there are any
    */
    public void sellItem()
    {
        if((this.itemAmt - 1) < 0)
        {
            System.out.println("We do not have enough "+this.itemName+"/s you ordered. Please try again.");
        }
        else
        {
            this.itemAmt -= 1;
        }
    }

    /**
    * displays item information
    */
    public void displayItem()
    {
        System.out.println("Item: "+this.itemName);
        System.out.println("Price: "+this.itemPrice);
        System.out.println("Calories: "+this.itemCal);
    }
}
