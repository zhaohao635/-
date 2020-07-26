package jinjie.day06.demo01;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        poker.add("大王");
        poker.add("小王");
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(number+color);
            }
        }
        //使用集合的工具类Collections中的方法
        //static void shuffle(List<?> list)
        Collections.shuffle(poker);     //不需要返回值，直接进行
//        System.out.println(poker);
        ArrayList<String> wanjia1 = new ArrayList<>();
        ArrayList<String> wanjia2 = new ArrayList<>();
        ArrayList<String> wanjia3 = new ArrayList<>();
        ArrayList<String> dipan = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i>=51){
                dipan.add(poker.get(i));
            }else if(i%3==0){
                wanjia1.add(poker.get(i));
            }else if(i%3==1){
                wanjia2.add(poker.get(i));
            }else if(i%3==2){
                wanjia3.add(poker.get(i));
            }
        }
        System.out.println(wanjia1);
        System.out.println(wanjia2);
        System.out.println(wanjia3);
        System.out.println(dipan);

    }
}
