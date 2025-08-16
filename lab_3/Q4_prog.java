//WAP to create a thread by extending thread class that prints a no. 1-10 with 1 second delay

package lab_3;

public class Q4_prog extends Thread{
    public static void main(String[] args)
        throws InterruptedException
    {
        for (int i=1; i<=10;i++){
            System.out.println(i);
            Thread.sleep(1000); //1 second delay
        }
        
    }
}