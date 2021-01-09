package javaPractice;

public class SavingsAccount2 {
    //    Instance Field
    double balance;
    //    constructor method
    public SavingsAccount2(double startingBalance){
        balance = startingBalance;
    }
    public void deposit(double amountToDeposit){
        //Add amountToDeposit to the balance
        double updatedBalance = balance + amountToDeposit;
        balance = updatedBalance;
    }
    public void withdraw(double amountToWithDraw){
        //subtract amountToWithdraw from the balance
    }
    public static void main(String[] args) {
        SavingsAccount2 myAccount = new SavingsAccount2(2000);
        System.out.println(myAccount.balance);
        myAccount.deposit(100);
        System.out.println(myAccount.balance);

    }
}

