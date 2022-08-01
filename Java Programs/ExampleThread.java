import java.util.*;

class ExampleThread implements Runnable{

    public ExampleThread() {

    }

         public void run() {
            System.out.println("Thread is executing ");
         }


    public static void main(String[] args) throws InterruptedException{

        ExampleThread threadProgram1 = new ExampleThread();
        ExampleThread threadProgram2 = new ExampleThread();
        ExampleThread threadProgram3 = new ExampleThread();
        ExampleThread threadProgram4 = new ExampleThread();
        ExampleThread threadProgram5 = new ExampleThread();
        Thread t1 = new Thread(threadProgram1);
        Thread t2 = new Thread(threadProgram2);
        Thread t3 = new Thread(threadProgram3);
        Thread t4 = new Thread(threadProgram4);
        Thread t5 = new Thread(threadProgram5);
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();

        Thread.currentThread().join();
            
    }
   


}