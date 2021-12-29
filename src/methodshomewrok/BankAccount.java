package methodshomewrok;
import java.util.*;

public class BankAccount {
	private int acctNum;
    private String name;
    private double balance;
    Scanner scanner = new Scanner(System.in);
    
    public BankAccount(double accbalance,String accname,int AccountNum)
    {
            balance = accbalance;
            name = accname ;
            acctNum =AccountNum ;
    }
  /*  public  BankAccount(double initialBalance)
    {
         balance=initialBalance;
    }
    public double deposit(double amount)
    {
          double deposit;
          System.out.println("Enter deposit amount:");
          deposit=scanner.nextDouble();
          balance=balance+amount;
          return balance;
    }
    */      
    public double withdraw(double wdamount)
    {
    if(wdamount<=balance)
    {
	  balance=balance-wdamount;
	  System.out.println("you have successfully withdrawn "+wdamount);

    }
    else
    {
	  System.out.println("you dont have sufficient account balnce to with draw "+wdamount);
    }
    return balance;
    }

     public double getBalance()
    {
    	return balance;

    }
    
   public class Bank {
    	public static void main(String [] args) 
        {
          BankAccount axisAccount=new BankAccount(100,"fkldkl",20000);
          double initialbalance=axisAccount.getBalance();
          System.out.println("Initialamount in the bank =" + initialbalance);
          Scanner input = new Scanner(System.in);
          
          System.out.println("Enter the amount to withdraw");
          double wdamount = input.nextDouble();
          initialbalance=axisAccount.withdraw(wdamount);
          System.out.println("your current account balance is "+initialbalance);
          System.out.println("AxisAccount balance=$" + axisAccount.getBalance());
         
          input.close();
  }
    	
    }

   
}




