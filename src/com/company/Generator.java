package com.company;

import java.util.Random;

/**
 * Created by jakub on 16.01.2017.
 */
public class Generator {
    public void generatNumbers() {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for(int i = 0; i < 10000000; i++) {
            random.nextInt();
        }
        long end = System.currentTimeMillis();
        System.out.println("Exec time:  " + (end - start) + " ms");
    }
}
