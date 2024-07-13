/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author Roimarc
 */
public class VMModel {
private RegularVM regVM = null;
private SpecialVM specVM = null;
private Money payment;
private int nPayment;
private int nCost = 0;
    
    public VMModel()
    {}
    
    public int getPayment()
    {
        return this.nPayment;
    }
    
    public void setPayment(int n)
    {
        this.nPayment = n;
    }
    
    public int getCost()
    {
        return this.nCost;
    }
    
    public void setCost(int n)
    {
        this.nCost = n;
    }
    
    public RegularVM getRegVM()
    {
        return this.regVM;
    }
    
    public SpecialVM getSpecVM()
    {
        return this.specVM;
    }
    
    public void setActiveVM(int decider, String name)
    {
        switch (decider) {
            case 0:
                break;
            case 1:
                this.specVM = null;
                this.regVM = new RegularVM(name);
                break;
            case 2:
                this.regVM = null;
                this.specVM = new SpecialVM(name);
                break;
            default:
                break;
        }
    }
    
    public int searchRegItem(String name)
    {
        int index = 0;
        boolean isDone = false;
        for(int i = 0; i < 8 && isDone == false; i++)
        {
            if(this.regVM.getItemSlot(i).getItemName() == name)
            {
                index = i;
                isDone = true;
            }
        }
        
        return index;
    }  

    
    
    public int searchSpecItem(String name)
    {
        int index = 0;
        boolean isDone = false;
        for(int i = 0; i < 8 && isDone == false; i++)
        {
            if(this.specVM.getItemSlot(i).getItemName() == name)
            {
                index = i;
                isDone = true;
            }
        }
        
        return index;
    }
    
    public String printRegReceipt(int index)
    {
        String text = "";
        
        if(this.specVM == null)
        {
            text = "<html>"+ this.regVM.getTransaction().getItemSlot(index).getItemName();
            text += ": "+this.regVM.getTransaction().getItemSlot(index).getItemCal()+" Cal<br/>";
            text += "COST: "+this.nCost+"<br/>";
            text += "PAYMENT: "+this.nPayment+"<br/>";
            text += "CHANGE: "+(this.nPayment - this.nCost)+"</html>";
        }
        else if(this.regVM == null)
        {
            text = "<html>"+ this.specVM.getTransaction().getItemSlot(index).getItemName();
            text += ": "+this.specVM.getTransaction().getItemSlot(index).getItemCal()+" Cal<br/>";
            text += "COST: "+this.nCost+"<br/>";
            text += "PAYMENT: "+this.nPayment+"<br/>";
            text += "CHANGE: "+(this.nPayment - this.nCost)+"</html>";
        }
        
        return text;
    }   
    
    public String printSpecReceipt(int index)
    {
        String text = "";
        
        if(this.specVM == null)
        {
            text = "<html>"+ this.regVM.getTransaction().getItemSlot(0).getItemName();
            text += ": "+this.regVM.getTransaction().getItemSlot(0).getItemCal()+" Cal<br/>";
            text += "COST: "+this.nCost+"<br/>";
            text += "PAYMENT: "+this.nPayment+"<br/>";
            text += "CHANGE: "+(this.nPayment - this.nCost)+"<br/><br/></html>";
        }
        else if(this.regVM == null)
        {
            text = "<html>"+ this.specVM.getTransaction().getItemSlot(index).getItemName();
            text += ": "+this.specVM.getTransaction().getItemSlot(index).getItemCal()+" Cal<br/>";
            text += "COST: "+this.nCost+"<br/>";
            text += "PAYMENT: "+this.nPayment+"<br/>";
            text += "CHANGE: "+(this.nPayment - this.nCost)+"</html>";
        }
        
        return text;
    }  
    
    public Money getPaymentMoney()
    {
        return this.payment;
    }
}
