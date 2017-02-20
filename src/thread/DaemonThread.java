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
public class DaemonThread extends Thread {
	public static void main(String[] args) {
		System.out.println("Main Method Entry");
 
		DaemonThread t = new DaemonThread();
		//t.setDaemon(true);
		t.start();
 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException x) {
		}
 
		System.out.println("Main Method Exit");
	}
 
	public void run() {
		System.out.println("run Method Entry");
 
		try {
			System.out.println("In run Method: currentThread() is"
					+ Thread.currentThread());
 
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException x) {
				}
 
				System.out.println("In run method.." + Thread.currentThread());
			}
		} finally {
			System.out.println("run Method Exit");
		}
	}
}

