package jinjie.day09.demo03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("in\\ae.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("写入多行字符串");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
