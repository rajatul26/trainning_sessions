/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.wait;

import java.util.List;

/**
 *
 * @author atul
 */
class Producer implements Runnable
{
   private final List<Integer> taskQueue;
   private final int           MAX_CAPACITY;
 
   public Producer(List<Integer> sharedQueue, int size)
   {
      this.taskQueue = sharedQueue;
      this.MAX_CAPACITY = size;
   }
 
   @Override
   public void run()
   {
      int counter = 0;
      while (true)
      {
         try
         {
            produce(counter++);
         } 
         catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
   private void produce(int i) throws InterruptedException
   {
      synchronized (taskQueue)
      {
         while (taskQueue.size() == MAX_CAPACITY)
         {
            System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
            taskQueue.wait();
         }
           
         Thread.sleep(1000);
         taskQueue.add(i);
         System.out.println("Produced: " + i);
         taskQueue.notifyAll();
         if(taskQueue.size() == MAX_CAPACITY)
         {
             
             System.out.println("Unless i'm not done, nobody can hold the lock ");
             Thread.sleep(2000);
             System.out.println("i'm done");
         }
      }
   }
}