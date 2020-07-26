package jinjie.day09.demo03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo05BuffledReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("in\\ae.txt"));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
