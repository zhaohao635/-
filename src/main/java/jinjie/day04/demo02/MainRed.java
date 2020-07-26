package jinjie.day04.demo02;

import java.util.ArrayList;

public class MainRed {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member a = new Member("A", 1);
        Member b = new Member("B", 5);
        Member c = new Member("C", 7);
        manager.show();
        ArrayList<Integer> list = manager.send(20, 3);
        a.receive(list);
        a.show();
        b.receive(list);
        b.show();
        c.receive(list);
        c.show();
        manager.show();
    }
}
