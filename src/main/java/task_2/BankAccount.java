package task_2;

public class BankAccount {

    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() > 10) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException("Номер аккаунту не може бути менше 10!");
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalStateException("Депозит має бути додатнім!");
        }
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalStateException("Недостатньо коштів!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}

