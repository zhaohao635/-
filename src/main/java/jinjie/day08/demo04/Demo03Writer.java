package jinjie.day08.demo04;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("in\\w.txt");
        char[] cs ={'找','w'};
        fw.write(cs);
        fw.write("写入字符串");
        fw.write("写入程序员这三个字",2,3);
        fw.close();
    }
}
