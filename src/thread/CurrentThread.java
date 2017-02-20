/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author atul
 */
public class CurrentThread {
    public static void main(String[] args) {
        Thread t =Thread.currentThread();
        System.out.println("current running thread is : " +  t.getName());
    }
    
}
