package lab_6;

class BankAmount{
    private int balance_amount=1500;

    public void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" is trying to hold lock for deposit");
        synchronized(this) {
             System.out.println(Thread.currentThread().getName()+" is trying to deposit "+amount);
                balance_amount+=amount;
                try{
                    Thread.sleep(100); //Simulating some delay
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                System.out.println("Amount Deposited: "+amount);
                System.out.println("New Balance: "+balance_amount);
        }
    }
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is trying to hold lock for withdraw");
        synchronized(this) {
            System.out.println(Thread.currentThread().getName()+" is trying to withdraw "+amount);
            if(amount<=balance_amount){
                balance_amount-=amount;
                try{
                    Thread.sleep(100); //Simulating some delay
                }catch(InterruptedException e){
                    System.out.println(e);
                }
                System.out.println("Amount Withdrawn---------: "+amount);
                System.out.println("Remaining Balance: "+balance_amount);
            }
            else{
                System.out.println("Insufficient Balance");
            }
    }
}}

public class Q2_prog {
        public static void main(String[] args) {
        BankAmount bank = new BankAmount();
             System.out.println(Thread.currentThread().getName());
        Thread th1 = new Thread(() -> {
            bank.deposit(500);
        },"Thread 1 : Depositing");

        Thread th2 = new Thread(() -> {
            bank.withdraw(1000);
        },"Thread 2: Withdrawing");

        Thread th3 = new Thread(() -> {
            bank.deposit(1200);
            bank.withdraw(3500); //Wont be able to withdraw cuz of insufficient balance
        },"Thread 3: Depositing and Withdrawing");

        th1.start();
        th2.start();
        th3.start();
    }
}