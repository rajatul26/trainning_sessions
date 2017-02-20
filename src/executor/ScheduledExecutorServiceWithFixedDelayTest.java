/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author atul
 */
public class ScheduledExecutorServiceWithFixedDelayTest {
    public static void main(String[] args) {
         Runnable runnable = new Runnable() {
      public void run() {
        // task to run goes here
        System.out.println("Hello !!");
      }
    };
    
    ScheduledExecutorService service = Executors
                    .newSingleThreadScheduledExecutor();
    service.scheduleAtFixedRate(runnable, 0, 2, TimeUnit.SECONDS);
    }
}
