package task_2;

public class Main {
    public static void main(String[] args){
        BankService bank = new BankService();
        SavingsAccount savingsAccount1 = new SavingsAccount("1111745895020475", 300, 15);
        SavingsAccount savingsAccount2 = new SavingsAccount("4574751894514478", 400, 15);

        BankAccount account1 = new BankAccount("1111745895020475", 10000);
        BankAccount account2 = new BankAccount("4574751894514478", 100);

        bank.transfer(account1, account2, 5000);
        bank.transfer(account2, account1, 40000);

        savingsAccount1.addInterest();
        savingsAccount2.addInterest();

        bank.printBalance(account1);
        bank.printBalance(account2);
    }
}
