package BankDetails;

public class BankAccount1 {


    private int accountNumber;
    private double balance;
    private String customerName;
  
   

    //constructors
    public BankAccount1() {
        //This constructor sets default parameters calling the next constructor
        this (12345, 1.50, "Dobby");
        System.out.println("Empty constructor called");
    }
    public   BankAccount1(int accountNumber, double balance, String customerName)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
     
     
    }

    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }


    //Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void depositFunds(double depositFunds){
        this.balance += depositFunds;
        System.out.println("You have deposited " + depositFunds + " , and your balance is " + balance);
    }

    public void withdrawFunds(double withdrawFunds){
        if(balance >= withdrawFunds){
            this.balance -= withdrawFunds;
            System.out.println("You have withdrawn " + withdrawFunds + " ,and your balance is " + balance);
        } else {
            System.out.println("Not enough funds available");
        }
    }
}