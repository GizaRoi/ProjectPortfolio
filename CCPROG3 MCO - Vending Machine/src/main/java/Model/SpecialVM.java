/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class SpecialVM 
{
    private String name;
    private int itemSlotNum = 8;
    private ItemSlot[] itemSlots = new ItemSlot[itemSlotNum];
    private Money balance;
    private Record record;
    private Record transaction;
    
    /**
    * constructs a regular vending machine with a custom name
    * @param name the name of the vending machine
    */
    public SpecialVM(String name)
    {  
        this.name = name;
        this.balance = new Money(100,100,100,100,100,100,100);
        this.itemSlots[0] = new ItemSlot("Dough 12oz", 120, 810, 10, "Punching Dough...", true, true);
        this.itemSlots[2] = new ItemSlot("Cheese 6oz", 30, 470, 10, "Sprinkling Cheese...", false, true);
        this.itemSlots[1] = new ItemSlot("Tomato Sauce 0.5Cup", 20, 50, 10, "Pouring Tomato Sauce...", false, true);
        this.itemSlots[3] = new ItemSlot("Pepperoni 40pcs", 35, 350, 10, "Laying Down Them Pepperoni Slices...", false, false);
        this.itemSlots[4] = new ItemSlot("Ham 5oz", 30, 140, 10, "Throwing Diced Ham Accurately onto the Pizza...", false, false);
        this.itemSlots[5] = new ItemSlot("Olives 3oz", 10, 123, 10, "Olives are being diced at the moment...", false, false);
        this.itemSlots[6] = new ItemSlot("Green Pepper 3oz", 42, 28, 10, "Topping Thy Pizza with le Green Peppeur", false, false);
        this.itemSlots[7] = new ItemSlot("Pineapple Tidbits", 1000, 1, 10, "*Angrily puts pineapple tidbits onto the pizza*", true, false);
        this.record = new Record();
        this.transaction = new Record();
    }
    
    public boolean isDispensable(Record transaction)
    {
        boolean isDone1 = false;
        boolean isDone2 = false;
        boolean isDone3 = false;
        boolean isDone = false;
        for(int i = 0; i<8 && (isDone1 == false || isDone2 == false || isDone3 == false); i++)
        {
            if(transaction.getItemSlot(i).getItemName() == "Dough 12oz")
            {
                isDone1 = true;
            }
            if(transaction.getItemSlot(i).getItemName() == "Cheese 6oz")
            {
                isDone2 = true;
            }
            if(transaction.getItemSlot(i).getItemName() == "Tomato Sauce 0.5Cup")
            {
                isDone3 = true;
            }
        }
        
        if(isDone1 == true && isDone2 == true && isDone3 == true)
        {
            isDone = true;
        }
        
        return isDone;
    }
    
    public void bringBackItems(Record orig)
    {
        for(int i = 0; i < 8; i++)
        {
            if(orig.getItemSlot(i).getItemAmt() != -1)
                itemSlots[i].setItemAmt(itemSlots[i].getItemAmt() + orig.getItemSlot(i).getItemAmt());
        }
    }
    
    public String displayProcess(Record transaction)
    {
        String text="<html>";
        
        for(int i = 0; i < 8; i++)
        {
            if(transaction.getItemSlot(i).getAction() != null)
                text+= transaction.getItemSlot(i).getAction()+"<br/>";
        }
        
        text += "Your Pizza is Done!";
        return text;
    }

    /**
    * returns the balance of the vending machine
    * @return the balance of the vending machine
    */
    public Money getBalance()
    {
        return this.balance;
    }

    /**
    * returns the name of the vending machine
    * @return the name of the vending machine
    */
    public String getName()
    {
        return this.name;
    }

    /**
    * returns a particular item slot of the vending machine
    * @return a particular item slot of the vending machine
    */
    public ItemSlot getItemSlot(int index)
    {
        return this.itemSlots[index];
    }

    /**
    * returns the record of the vending machine
    * @return the record of the vending machine
    */
    public Record getRecord()
    {
        return this.record;
    }

    public Record getTransaction()
    {
        return this.transaction;
    }
    
    /**
    * sets the name of the vending machine
    * @param name the name of the vending machine
    */
    public void setName(String name)
    {
        this.name = name;
    }
}

