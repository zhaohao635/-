package jinjie.day09.demo03;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("in\\ad.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("把字符串转换为字节写入到内部缓冲区".getBytes());
        bos.flush();
        bos.close();
    }
}
