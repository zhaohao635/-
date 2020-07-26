package jinjie.day09.demo05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("in\\we2.txt"));
        Object o = ois.readObject();
        Object o1 = ois.readObject();       //读取第二个Person
        ois.close();
        System.out.println(o1);
    }
}
