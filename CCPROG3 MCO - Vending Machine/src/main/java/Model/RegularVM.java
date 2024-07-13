package Model;
import java.util.*;

public class RegularVM 
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
    public RegularVM(String name)
    {  
        this.name = name;
        this.balance = new Money(100,100,100,100,100,100,100);
        this.itemSlots[0] = new ItemSlot("C2 500mL", 55, 100, 10);
        this.itemSlots[1] = new ItemSlot("Coke Mismo 300mL", 30, 375, 8);
        this.itemSlots[2] = new ItemSlot("VitaMilk 300mL", 42, 210, 5);
        this.itemSlots[3] = new ItemSlot("Fiji Water 500mL", 137, 0, 2);
        for(int i = 4; i < itemSlotNum; i++)
        {
            this.itemSlots[i] = new ItemSlot();
        }
        this.record = new Record();
        this.transaction = new Record();
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
