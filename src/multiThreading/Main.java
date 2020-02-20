package multiThreading;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("========= Creat new Thead ==========");

        Thread thread = new Thread(() -> {
            System.out.println("we are now in thread " + Thread.currentThread().getName());
            System.out.println("Current thread priority is  " + Thread.currentThread().getPriority() );
        });

        thread.setName("New Worker Thread");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in thread " + Thread.currentThread().getName() + " before starting a new Thread");
        thread.start();
        System.out.println("We are in thread " + Thread.currentThread().getName() + " after starting a new Thread");

        //Thread.sleep(2000);
    }
}

 class MultiExecutor {

    // Add any necessary member variables here
    List<Thread> threads;
    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        // Complete your code here
        for (Runnable task : tasks){
            Thread t = new Thread(task);
            threads.add(t);
        }
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        for(Thread thread: threads){
            thread.start();
        }
    }
}