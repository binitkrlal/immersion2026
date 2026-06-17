package BankApp;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private String accountType;
    private double  balance;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setBankAccount(int bankAccount) {
        accountNumber = bankAccount;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public BankAccount(int accountNumber, String accountHolderName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public double getBalence() {
        return balance;
    }
    public void setBalence(int balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BankAccount{");
        sb.append("BankAccount=").append(accountNumber);
        sb.append(", accountHolderName=").append(accountHolderName);
        sb.append(", accountType=").append(accountType);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
    

}
