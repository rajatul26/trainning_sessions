/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.Random;

/**
 *
 * @author atul
 */
public class RunnableThread implements Runnable{

    @Override
    public void run() {
        int terminator;
        while(true){
            terminator=new Random().nextInt(10);
        System.out.println("This is a runnable thread. Terminator = "+terminator);
        if(terminator>8){
            System.out.println("Terminator value is "+terminator+" exiting");
        break;
        }
            
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Runnable r= new RunnableThread();
        Thread t=new Thread(r);
        t.start();
  
        System.out.println("Current thread is "+Thread.currentThread().getName());
            
    }
    
}
