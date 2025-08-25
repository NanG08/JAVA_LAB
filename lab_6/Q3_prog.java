package lab_6;

class DeadLock{
    private final Object r1 = new Object();
    private final Object r2 = new Object();

    public void method1(){
        synchronized(r1){
            System.out.println("Resource 1 held by Thread 1...");
            try{Thread.sleep(100);}catch(InterruptedException e){}
            System.out.println("Thread 1: Waiting for Resource 2...");
            synchronized(r2){
                System.out.println("Thread 1: Resource 2 with thread 2!");
            }
        }
    }
    public void method2(){
        synchronized(r2){
            System.out.println("Resource 2 held by Thread 2...");
            try{Thread.sleep(100);}catch(InterruptedException e){}
            System.out.println("Thread 2: Waiting for Resource 1...");
            synchronized(r1){
                System.out.println("Thread 2: Resource 1 with thread 1!");
            }
        }
    }
}
public class Q3_prog {
    public static void main(String[] args) {
        DeadLock dl = new DeadLock();

        Thread t1 = new Thread(() -> {
            dl.method1();
        },"Thread 1");

        Thread t2 = new Thread(() -> {
            dl.method2();
        },"Thread 2");

        t1.start();
        t2.start();
    }   
}
