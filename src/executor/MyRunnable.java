/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executor;

/**
 *
 * @author atul
 */
public class MyRunnable implements Runnable {
        private final long countUntil;

        MyRunnable(long countUntil) {
                this.countUntil = countUntil;
        }

        @Override
        public void run() {
                long sum = 0;
                for (long i = 1; i < countUntil; i++) {
                        sum += i;
                }
                System.out.println(sum);
        }
}