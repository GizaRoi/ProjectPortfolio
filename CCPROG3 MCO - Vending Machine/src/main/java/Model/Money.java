package Model;
import java.util.*;

public class Money 
{
    private int peso1;
    private int peso5;
    private int peso20;
    private int peso50;
    private int peso100;
    private int peso500;
    private int peso1000;

    /**
    * creates an instance of the money class with a certain amount of money denominations
    * @param peso1 number of 1 peso coins
    * @param peso5 number of 5 peso coins
    * @param peso20 number of 20 peso bills
    * @param peso50 number of 50 peso bills
    * @param peso100 number of 100 peso bills
    * @param peso500 number of 500 peso bills
    * @param peso1000 number of 1000 peso bills
    */
    public Money(int peso1, int peso5, int peso20, int peso50, int peso100, int peso500, int peso1000)
    {
        this.peso1 = peso1;
        this.peso5 = peso5;
        this.peso20 = peso20;
        this.peso50 = peso50;
        this.peso100 = peso100;
        this.peso500 = peso500;
        this.peso1000 = peso1000;
    }
    
    /**
    * returns number of 1 peso coins
    * @return number of 1 peso coins
    */
    public int getPeso1()
    {
        return this.peso1;
    }

    /**
    * returns number of 5 peso coins
    * @return number of 5 peso coins
    */
    public int getPeso5()
    {
        return this.peso5;
    }

    /**
    * returns number of 20 peso bills
    * @return number of 20 peso bills
    */
    public int getPeso20()
    {
        return this.peso20;
    }

    /**
    * returns number of 50 peso bills
    * @return number of 50 peso bills
    */
    public int getPeso50()
    {
        return this.peso50;
    }

    /**
    * returns number of 100 peso bills
    * @return number of 100 peso bills
    */
    public int getPeso100()
    {
        return this.peso100;
    }

    /**
    * returns number of 500 peso bills
    * @return number of 500 peso bills
    */
    public int getPeso500()
    {
        return this.peso500;
    }

    /**
    * returns number of 1000 peso bills
    * @return number of 1000 peso bills
    */
    public int getPeso1000()
    {
        return this.peso1000;
    }
    
    public void addPeso1()
    {
        this.peso1++;
    }
    
    public void addPeso5()
    {
        this.peso5++;
    }
    
    public void addPeso20()
    {
        this.peso20++;
    }
    
    public void addPeso50()
    {
        this.peso50++;
    }
    
    public void addPeso100()
    {
        this.peso100++;
    }
    
    public void addPeso500()
    {
        this.peso500++;
    }
    
    public void addPeso1000()
    {
        this.peso1000++;
    }
    
    public void addPeso1(int amt)
    {
        this.peso1 = amt;
    }
    
    public void addPeso5(int amt)
    {
        this.peso5 = amt;
    }
    
    public void addPeso20(int amt)
    {
        this.peso20 = amt;
    }
    
    public void addPeso50(int amt)
    {
        this.peso50 = amt;
    }
    
    public void addPeso100(int amt)
    {
        this.peso100 = amt;
    }
    
    public void addPeso500(int amt)
    {
        this.peso500 = amt;
    }
    
    public void addPeso1000(int amt)
    {
        this.peso1000 = amt;
    }
    
    /**
    * calculates the totality of all money denominations
    * @return the total amount of money
    */
    public int getTotal()
    {
        int pesoTotal = this.peso1 * 1 + this.peso5 * 5 + this.peso20 * 20 + this.peso50 * 50 +
                        this.peso100 * 100 + this.peso500 * 500 + this.peso1000 * 1000;
        return pesoTotal;
    }

    /**
    * lets the program know if there is enough change before committing to the change dispensing algorithm
    * @param cost the cost of the given item
    * @param payment the totality of the given money denominations
    * @return true if change is enough, false if enough change cannot be given
    */
    public boolean isEnoughChange(int cost, int payment)
    {
        boolean isEnough;
        
        int change = payment - cost;
    
        for(int a = 0; change/1000 > 0 && a <= this.peso1000 && change > 0; a++)
        {
            change -= 1000;
        }
        for(int b = 0; change/500 > 0 && b <= this.peso500 && change > 0; b++)
        {
            change -= 500;
        }
        for(int c = 0; change/100 > 0 && c <= this.peso100 && change > 0; c++)
        {
            change -= 100;
        }
        for (int d = 0; change/50 > 0 && d <= this.peso50 && change > 0; d++)
        {
            change -= 50;
        }
        for (int e = 0; change/20 > 0 && e <= this.peso20 && change > 0; e++)
        {
            change -= 20;
        }
        for (int f = 0; change/5 > 0 && f <= this.peso5 && change > 0; f++)
        {
            change -= 5;
        }
        for (int g = 0; change/1 > 0 && g <= this.peso1 && change > 0; g++)
        {
            change -= 1;
        }

        if(change <= 0)
        {
            isEnough = true;
        }
        else
            isEnough = false;

        return isEnough;
    }

    /**
    * runs the same change dispensing algorithm but is now committed
    * @param cost the cost of the given item
    * @param payment the totality of the given money denominations
    */
    public void giveChange(int cost, int payment)
    {
        int change = payment - cost;
    
        int temp1 = this.peso1; int temp5 = this.peso5; int temp20 = this.peso20; int temp50 = this.peso50;
        int temp100 = this.peso100; int temp500 = this.peso500; int temp1000 = this.peso1000;

        for(int a = 0; change/1000 > 0 && a <= temp1000 && change != 0; a++)
        {
            change -= 1000;
            this.peso1000--;
        }
        for(int b = 0; change/500 > 0 && b <= temp500 && change != 0; b++)
        {
            change -= 500;
            this.peso500--;
        }
        for(int c = 0; change/100 > 0 && c <= temp100 && change != 0; c++)
        {
            change -= 100;
            this.peso100--;
        }
        for (int d = 0; change/50 > 0 && d <= temp50 && change != 0; d++)
        {
            change -= 50;
            this.peso50--;
        }
        for (int e = 0; change/20 > 0 && e <= temp20 && change != 0; e++)
        {
            change -= 20;
            this.peso20--;
        }
        for (int f = 0; change/5 > 0 && f <= temp5 && change != 0; f++)
        {
            change -= 5;
            this.peso5--;
        }
        for (int g = 0; change/1 > 0 && g <= temp1 && change != 0; g++)
        {
            change -= 1;
            this.peso1--;
        }
    }

    /**
    * lets user add money denominations to be used as change
    * @param s lets the user enter input
    */
    public void addChange(Scanner s)
    {
        char cInput;
        int payment =0;

        int temp1 = this.peso1; int temp5 = this.peso5; int temp20 = this.peso20; int temp50 = this.peso50;
        int temp100 = this.peso100; int temp500 = this.peso500; int temp1000 = this.peso1000;

        do{
            System.out.println("============== ADD CHANGE ==============");
            System.out.println("[1] Give 1 Peso");
            System.out.println("[2] Give 5 Pesos");
            System.out.println("[3] Give 20 Pesos");
            System.out.println("[4] Give 50 Pesos");
            System.out.println("[5] Give 100 Pesos");
            System.out.println("[6] Give 500 Pesos");
            System.out.println("[7] Give 1000 Pesos");
            System.out.println("[X] Finish Adding Change");
            System.out.println("[C] Cancel Adding Change");
            System.out.println("Total Change: "+payment);
            System.out.print(" > ");
            cInput = s.nextLine().charAt(0);

            switch(cInput)
            {
                case '1': this.peso1++; payment ++; break;
                case '2': this.peso5++; payment +=5; break;
                case '3': this.peso20++; payment +=20; break;
                case '4': this.peso50++; payment +=50; break;
                case '5': this.peso100++; payment += 100; break;
                case '6': this.peso500++; payment += 500; break;
                case '7': this.peso1000++; payment += 1000; break;
                case 'X': case 'x': break;
                case 'C': case 'c':
                    System.out.println("Transaction Cancelled.");
                    this.peso1 = temp1; this.peso5 = temp5; this.peso20 = temp20; this.peso50 = temp50;
                    this.peso100 = temp100; this.peso500 = temp500; this.peso1000 = temp1000; payment = 0; break;
                default: System.out.println("Invalid input. Please try again.");
            }
        }while(cInput != 'X' && cInput != 'x');

        System.out.println("============== CHANGE RESERVOIR REPORT ============");
            displayMoney();
    }

    /**
    * gives payment for the transaction using denominations
    * @param s lets user enter input
    * @param item is the item to be bought
    * @return true if transaction was successful, false if not
    */
    public boolean payMoney(Scanner s, ItemSlot item)
    {
        char cInput;
        int payment = 0;
        boolean isEnough;
        boolean isSuccessful = false;

        int temp1 = this.peso1; int temp5 = this.peso5; int temp20 = this.peso20; int temp50 = this.peso50;
        int temp100 = this.peso100; int temp500 = this.peso500; int temp1000 = this.peso1000;
        
        do{
            System.out.println("============== PAYMENT ==============");
            System.out.println(item.getItemName()+" Cost: "+item.getItemPrice());
            System.out.println("=====================================");
            System.out.println("[1] Give 1 Peso");
            System.out.println("[2] Give 5 Pesos");
            System.out.println("[3] Give 20 Pesos");
            System.out.println("[4] Give 50 Pesos");
            System.out.println("[5] Give 100 Pesos");
            System.out.println("[6] Give 500 Pesos");
            System.out.println("[7] Give 1000 Pesos");
            System.out.println("[X] Finish Payment");
            System.out.println("[C] Cancel Transaction");
            System.out.println("Total Payment: "+payment);
            System.out.print(" > ");
            cInput = s.nextLine().charAt(0);

            switch(cInput)
            {
                case '1': this.peso1++; payment ++; break;
                case '2': this.peso5++; payment +=5; break;
                case '3': this.peso20++; payment +=20; break;
                case '4': this.peso50++; payment +=50; break;
                case '5': this.peso100++; payment += 100; break;
                case '6': this.peso500++; payment += 500; break;
                case '7': this.peso1000++; payment += 1000; break;
                case 'X': case 'x': break;
                case 'C': case 'c':
                    System.out.println("Transaction Cancelled.");
                    this.peso1 = temp1; this.peso5 = temp5; this.peso20 = temp20; this.peso50 = temp50;
                    this.peso100 = temp100; this.peso500 = temp500; this.peso1000 = temp1000; payment = 0; break;
                default: System.out.println("Invalid input. Please try again.");
            }
        }while(cInput != 'X' && cInput != 'x');

        if(item.getItemPrice() > payment)
        {
            System.out.println("Payment insufficient. Transaction Cancelled.");
            payment = 0;
        }
        else
        {
            isEnough = isEnoughChange(item.getItemPrice(), payment);
            if (isEnough == true)
            {
                giveChange(item.getItemPrice(), payment);
                item.sellItem();
                System.out.println("==================== RECEIPT ======================");
                System.out.println("ITEM BOUGHT: "+item.getItemName()+" x 1");
                System.out.println("BALANCE: "+item.getItemPrice()+" PHP");
                System.out.println("PAYMENT: "+payment+" PHP");
                System.out.println("CHANGE: "+(item.getItemPrice() - payment)+" PHP");
                System.out.println("============== CHANGE RESERVOIR REPORT ============");
                displayMoney();
                isSuccessful = true;
            }
            else if (isEnough == false)
            {
                System.out.println("Not enough change. Transaction Cancelled");
                this.peso1 = temp1; this.peso5 = temp5; this.peso20 = temp20; this.peso50 = temp50;
                this.peso100 = temp100; this.peso500 = temp500; this.peso1000 = temp1000; payment = 0;
            }

        }

        return isSuccessful;
    }
    
    /**
    * displays the amount of each denomination, their values, and the totality
    */
    public String displayMoney()
    {
        String text = "";
        text += "1 Peso: "+this.peso1+" = "+this.peso1 * 1+"<br/>";
        text += "5 Pesos: "+this.peso5+" = "+this.peso5 * 5+"<br/>";
        text += "20 Pesos: "+this.peso20+" = "+this.peso20 * 20+"<br/>";
        text += "50 Pesos: "+this.peso50+" = "+this.peso50 * 50+"<br/>";
        text += "100 Pesos: "+this.peso100+" = "+this.peso100 * 100+"<br/>";
        text += "500 Pesos: "+this.peso500+" = "+this.peso500 * 500+"<br/>";
        text += "1000 Pesos: "+this.peso1000+" = "+this.peso1000 * 1000+"<br/>";
        text += "===================================<br/>";
        int pesoTotal = getTotal();
        text += "Total: "+pesoTotal+"</html>";
        
        return text;
    }
}
