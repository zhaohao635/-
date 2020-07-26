package jinjie.day05.demo01;

import java.util.ArrayList;

public class TestMian {
    public static void main(String[] args) {
        ObjToString obj = new ObjToString("赵");
        System.out.println(obj);
        ArrayList<String> list = new ArrayList<>();
        list.add("zd");
        list.add("wer");
        System.out.println(list);
        obj.toString();
    }
}
