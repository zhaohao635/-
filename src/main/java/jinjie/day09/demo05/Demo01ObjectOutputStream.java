package jinjie.day09.demo05;

import com.google.common.io.FileBackedOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("in\\we2.txt"));
        oos.writeObject(new Person("小美女",18));
        oos.writeObject(new Person("小美女1",19));
        oos.close();
    }
}
