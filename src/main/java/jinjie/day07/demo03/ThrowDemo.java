package jinjie.day07.demo03;

import java.io.FileNotFoundException;
import java.io.IOException;


public class ThrowDemo {
    public static void main(String[] args) {
        try {
            read("aa.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("fafda");
    }

    private static void read(String s) throws IOException {
        if (!"a.txt".equals(s)){
            throw new FileNotFoundException("文件不存在");
        }
//        if (!s.equals("b.txt")){
//            throw new IOException("fagag");
//        }
    }
}
