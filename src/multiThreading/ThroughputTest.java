package multiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThroughputTest {

    public static void main(String[] args) {
        List<String> names = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            // int r = (int) (Math.random() * 1000);
            names.add("Samir " + i);
        }
        long start = System.currentTimeMillis();
        Executor executor = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            final int k = i;
            Runnable runnable = () -> {
                for (int j = 0; j < 250; j++) {
                    System.out.println("Hello " + names.get( j + (250 * k) ));
                }
            };
            executor.execute(runnable);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time to display all items is : " + (end - start));
    }
}
