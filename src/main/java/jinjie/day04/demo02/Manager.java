package jinjie.day04.demo02;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalmoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (leftMoney<totalmoney){
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(leftMoney-totalmoney);
        int avg = totalmoney/count;
        int mod = totalmoney%count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        redList.add(avg+mod);
        return redList;
    }
}
