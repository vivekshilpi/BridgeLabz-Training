package BankingSystem;

public abstract class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private  double balance;

    public BankAccount(long accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance-=amount;

        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
    public void getDetails(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account holder name: "+accountHolderName);
    }

}
