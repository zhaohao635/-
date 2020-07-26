package jinjie.day09.demo04;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("in\\we.txt"),"gbk");
//        FileWriter osw = new FileWriter("we1.txt");

        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
