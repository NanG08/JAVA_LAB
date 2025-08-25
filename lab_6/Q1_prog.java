package lab_6;

class BankAmount{
    private int balance_amt=25000;

    public synchronized void deposit(int amt){
        balance_amt+=amt;
        System.out.println("Amount Deposited: "+amt);
        System.out.println("New Balance: "+balance_amt);
    }

    public synchronized void withdraw(int amt){
        if(amt<=balance_amt){
            balance_amt-=amt;
            System.out.println("Amount Withdrawn: "+amt);
            System.out.println("Remaining Balance: "+balance_amt);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}

public class Q1_prog {
    public static void main(String[] args) {
        BankAmount bank = new BankAmount();

        Thread t1 = new Thread(() -> {
            bank.deposit(5000);
        },"Thread 1 : Depositing");

        Thread t2 = new Thread(() -> {
            bank.withdraw(3000);
        },"Thread 2: Withdrawing");

        Thread t3 = new Thread(() -> {
            bank.deposit(1200);
            bank.withdraw(40000); //Wont be able to withdraw cuz of insufficient balance
        },"Thread 3: Depositing and Withdrawing");

        t1.start();
        t2.start();
        t3.start();
    }
}
