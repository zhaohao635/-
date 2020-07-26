package jinjie.day09.demo03;

import java.io.*;
import java.util.HashMap;

public class Demo06Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("in\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("in\\out.txt"));
        String line;
        HashMap<String, String> map = new HashMap<>();
        while ((line = br.readLine())!=null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }
        for (String key : map.keySet()) {
            String value = map.get(key);
            bw.write(key+"."+value);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
