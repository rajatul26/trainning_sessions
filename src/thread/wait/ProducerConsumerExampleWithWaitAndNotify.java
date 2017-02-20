/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.wait;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author atul
 */
public class ProducerConsumerExampleWithWaitAndNotify
{
   public static void main(String[] args)
   {
      List<Integer> taskQueue = new ArrayList<Integer>();
      int MAX_CAPACITY = 5;
      Thread tProducer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer");
      Thread tConsumer = new Thread(new Consumer(taskQueue), "Consumer");
      tConsumer.start();
      tProducer.start();
      
   }
}
