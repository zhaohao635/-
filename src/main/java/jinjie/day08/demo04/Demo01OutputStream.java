package jinjie.day08.demo04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("in\\b.txt",true);
        fos.write(93);
        fos.write(47);
//        byte[] b = {67,68,69,70,71};
//        fos.write(b);
        byte[] b = {-67,-68,-69,70,71};
        fos.write(b);
        fos.write("\r\n".getBytes());
        byte[] bytes = "你好".getBytes();
        fos.write(bytes);
        fos.close();
    }
}
