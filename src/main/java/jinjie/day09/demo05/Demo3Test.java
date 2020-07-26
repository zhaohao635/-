package jinjie.day09.demo05;

import java.io.*;
import java.util.ArrayList;

public class Demo3Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("in\\we3.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("in\\we3.txt"));
        Object o = ois.readObject();

        ArrayList<Person> list1 = (ArrayList<Person>)o;
        for (Person person : list1) {
            System.out.println(person);
        }
        ois.close();
        oos.close();

    }
}
