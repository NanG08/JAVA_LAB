//WAP to create a Thread by impplementing Runnable interface that prints "Hello World" 5 times each on a new line.

package lab_3;

public class Q5_prog implements Runnable {
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Hello World!");
        }    
    }

    public static void main(String[] args){
        Q5_prog t = new Q5_prog();
        Thread thread = new Thread(t);
        thread.start();
    }
}
