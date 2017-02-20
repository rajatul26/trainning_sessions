/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author atul
 */
public class ExecutorExample {
        private static final int NTHREDS = 10;

        public static void main(String[] args) throws InterruptedException {
                ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
                for (int i = 0; i < 500; i++) {
                        Runnable worker = new MyRunnable(10000000L + i);
                        executor.execute(worker);
                }
                          // This will make the executor accept no new threads
                // and finish all existing threads in the queue
                executor.shutdown();
           
      
                // Wait until all threads are finish
               executor.awaitTermination(30, TimeUnit.SECONDS);
                System.out.println("Finished all threads");
        }
}