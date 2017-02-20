/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author atul
 */
public class ThreadClass {

    public static void main(String[] args) {
       ThreadClass threadClass=new ThreadClass();
       Thread t=  threadClass.new MyThread();
       t.start();
        System.out.println("main method is finished...");
        
    }
    
    class MyThread extends Thread{

        @Override
        public void run(){
            while(true){
                try {
                    System.out.println("this is my first thread programme");
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
}
