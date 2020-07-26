package jinjie.day09.demo03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("in\\ad.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}
