package javaPractice;

public class SavingsAccount3 {
    int balance;

    public SavingsAccount3(int initialBalance){
        balance = initialBalance;
    }
    public void checkBalance(){
        System.out.println("Hello. Welcome to the bank!");
        System.out.println("Your starting balance today is $" + balance);
    }
    public void deposit (int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited $" + amountToDeposit);
    }
    public int withdraw(int amountToWithdraw){
        balance = amountToWithdraw + balance;
        System.out.println("You just withdrew $ "+ amountToWithdraw);
        return amountToWithdraw;
    }
    public String toString(){
        return "This is a savings account with $" + balance + " saved.";
    }

    public static void main(String[] args) {
        SavingsAccount3 savings = new SavingsAccount3(2000);

//        check the balance
            savings.checkBalance();
//        System.out.println("Hello. Welcome to the bank!");
//        System.out.println("Your balance is $" + savings.balance);

//        Withdrawing
            savings.withdraw(300);
//        int afterWithdraw = savings.balance - 300;
//        savings.balance = afterWithdraw;
//        System.out.println("You just withdrew $" + 300);
//        System.out.println("Your balance now is $"+savings.balance);

//            depositing
                    savings.deposit(600);
//        int afterDeposit = savings.balance + 600;
//        savings.balance = afterDeposit;
//        System.out.println("You just deposited $" +600);
//        System.out.println("Your balance is now $ " + savings.balance);

            savings.deposit(900);
//        int afterDeposit2 = savings.balance + 600;
//        savings.balance = afterDeposit2;
//        System.out.println("You just deposited $" + 600);
//        System.out.println("Your balance is now $" + savings.balance);
        System.out.println(savings);
    }
}
