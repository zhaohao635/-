package jinjie.day08.demo04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("in\\b.txt");
        int len = fis.read();
        System.out.println(len);
        fis.close();
    }
}
