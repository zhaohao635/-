package jinjie.day08.demo03;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        File file = new File("F:\\java文档\\java文档");
        System.out.println(file);
        File file1 = new File("c:", "a.txt");
        System.out.println(file1);
        File file2 = new File(file, "a.txt");
        System.out.println(file2);
        File file3 = new File("a.txt");
        System.out.println(file3.getAbsolutePath());
        String name = file.getName();
        System.out.println(name);
        System.out.println(file3.length());
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=========");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }


    }
}
