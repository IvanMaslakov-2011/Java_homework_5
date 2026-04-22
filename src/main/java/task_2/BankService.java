package task_2;

public class BankService {

    public void transfer(BankAccount from, BankAccount to, double amount){
      try {
          from.withdraw(amount);
          to.deposit(amount);
      } catch (IllegalStateException e){
          System.out.println(e.getMessage());
      }
    }

    public void printBalance(BankAccount account){
        System.out.println("Баланс рахунку " + account.getAccountNumber() + " становить: " + account.getBalance());
    }
}
