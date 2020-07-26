package jinjie.day03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(5);
            System.out.println(num);
        }
    }
}
