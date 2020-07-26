package jinjie.day03;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Demo03ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(5)+1);

        }
        System.out.println("list的打印结果为："+list);
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
