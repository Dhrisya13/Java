import java.util.Scanner;
class MultiplicationThread extends Thread {

public void run() {
    System.out.println("-> Multiplication Thread started.");
    try {
       for (int i = 1; i <= 10; i++) {
         System.out.println("5 x " + i + "=" + (5 * i));
         Thread.sleep(200);
         }
    } catch  (InterruptedException e) {
         System.out.println("Multiplication Thread Interrupted");
         }
      }
}
class PrimeThread extends Thread {
private int limit;
public PrimeThread(int limit) {
      this.limit = limit;
      }

public void run() {
      System.out.println("-> Prime Thread Started.");
      try {
        int count = 0, num = 2;
        while (count < limit) {
           boolean isPrime = true;
           for (int i = 2; i<= num / 2; i++) {
               if (num % i == 0) {
                  isPrime = false;
                  break; 
                }
           }       
           if (isPrime) {
               System.out.println("Prime:" + num);
               count++;
               Thread.sleep(250);
           }
           num++;
        }
      } catch (InterruptedException e) {
             System.out.println("Prime Thread interrupted.");
      }
   }                  
}

public class MultithreadingMain {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter limit for prime numbers");
      int n = sc.nextInt();
      
      MultiplicationThread t1 =  new MultiplicationThread();
      PrimeThread t2 = new PrimeThread(n);
      
      System.out.println("\nInitializing JVM Threads...\n");
      t1.start();
      t2.start();
   sc.close();
   }
}      
