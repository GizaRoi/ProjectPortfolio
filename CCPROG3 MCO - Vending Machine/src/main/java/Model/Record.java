package Model;
public class Record {
    private int earnings;
    private ItemSlot[] slots = new ItemSlot[8];
    private String text = "";

    /**
    * constructs an empty record
    */
    public Record()
    {
        this.earnings = 0;
        for(int i = 0; i < 8; i++)
        {
            this.slots[i] = new ItemSlot();
        }
    }

    /**
    * returns the earnings of the vending machine
    * @return vending machine earnings
    */
    public int getEarnings()
    {
        return this.earnings;
    }
    
    public ItemSlot getItemSlot(int index)
    {
        return this.slots[index];
    }
    
    public int findItem()
    {
        int index = -1;
        boolean isDone = false;
        for(int i = 0; i < 8 && !isDone; i++)
        {
            if(slots[i].getItemName() != "<Empty>")
            {
                isDone = true;
                index = i;
            }
        }
        return index;
    }
    
    public void addItem(ItemSlot item, int amount)
    {
        boolean nDone = false;
        for(int i = 0; i < 8 && nDone == false; i++)
        {
            if(slots[i].getItemName() == "<Empty>")
            {
                slots[i].setItemName(item.getItemName());
                slots[i].setItemPrice(item.getItemPrice());
                slots[i].setItemCal(item.getItemCal());
                slots[i].setItemAmt(amount);
                this.earnings += item.getItemPrice();
                nDone = true;
            }
            else if (slots[i].getItemName() == item.getItemName())
            {
                slots[i].setItemAmt(slots[i].getItemAmt() + amount);
                this.earnings += item.getItemPrice();
                nDone = true;
            }
        }
    }
    
    public int countItemAmt()
    {
        int nTotal = 0;
        for(int i = 0; i<8; i++)
        {
            if(slots[i].getItemAmt() != -1)
            {
                nTotal += slots[i].getItemAmt();
            }
        }
            
        return nTotal;
    }
    
    public void addItem(ItemSlot item, int amount, int index)
    {
        slots[index].setItemName(item.getItemName());
        slots[index].setItemPrice(item.getItemPrice());
        if(slots[index].getItemAmt() == -1)
        {
           slots[index].setItemAmt(amount);
        }
        else
        {
            slots[index].setItemAmt(amount + slots[index].getItemAmt());
        }
        slots[index].setItemCal(item.getItemCal());
        slots[index].setAction(item.getAction());
        this.earnings += item.getItemPrice();
    }
    
    public void transferSpecItems(Record orig, Record dest)
    {
        for(int i = 0; i < 8; i++)
        {
            if(dest.getItemSlot(i).getItemName() != null)
            {
                dest.addItem(orig.getItemSlot(i), orig.getItemSlot(i).getItemAmt(), i);
            }
        }
    }
    
    
    public int getTotalCal()
    {
        int nTotal = 0;
        
        for (int i = 0; i < 8; i++)
        {
            nTotal += this.slots[i].getItemCal();
        }
        
        return nTotal;
    }

    /**
    * empties out the items in the record after restocking
    */
    public void resetInventory()
    {
        for(int i = 0; i < 8; i++)
        {
            this.slots[i] = new ItemSlot();
        }
    }

    /**
    * empties earnings after earnings are collected by the user
    */
    public void resetEarnings()
    {
        this.earnings = 0;
    }
    
    /**
    * displays the statistics of the vending machine
    */
    public String displayTransaction()
    {
        this.text = "<html>";
        int total = 0;
        boolean isAnySold = false;
        for(int i = 0; i < 8; i++)
        {
            if(slots[i].getItemName() != "<Empty>")
            {
                this.text+= i+1+". "+slots[i].getItemName()+": "+slots[i].getItemAmt()+" Sold = "
                +(slots[i].getItemAmt() * slots[i].getItemPrice())+" Pesos<br/>";
                total += slots[i].getItemPrice();
                isAnySold = true;
            }
        }
        this.text += "</html>";
        return text;
    }
    
    public String displayRecord()
    {
        String text = "<html>";
        int total = 0;
        boolean isAnySold = false;
        for(int i = 0; i < 8; i++)
        {
            if(slots[i].getItemName() != "<Empty>")
            {
                text += i+1+". "+slots[i].getItemName()+": "+slots[i].getItemAmt()+" Sold = "
                +(slots[i].getItemAmt() * slots[i].getItemPrice())+" Pesos<br/>";
                total += slots[i].getItemPrice();
                isAnySold = true;
            }
        }
        if (isAnySold == false)
        {
            text += "THERE WERE NO ITEMS SOLD.";
        }
        text += "TOTAL: "+total+" PHP<br/>";
        text += "======================================<br/>";
        text += "EARNINGS: "+earnings+" PHP<br/>";
        text += "======================================</br>";
        text += "*Note: If earnings are 0, they may have been collected.</html>";
        
        return text;
    }
    
}
