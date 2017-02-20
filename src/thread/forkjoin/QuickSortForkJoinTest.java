/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author atul
 */
public class QuickSortForkJoinTest {
    public static void main(String[] args) {
        final int SIZE = 10000;
 
        List<Integer> myList = new ArrayList<Integer>(SIZE);
 
        for (int i=0; i<SIZE; i++){
            int value = (int) (Math.random() * 100);
            myList.add(value);
        }
 
        QuickSort<Integer> quickSort = new QuickSort<Integer>(myList);
        System.out.println(quickSort);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(quickSort);
        System.out.println(quickSort);
    }
}
