package jinjie.day09.demo03;

import java.io.*;

public class Demo03Copy {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\jieguo\\jieguo.rar"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\ji.rar"));
        int len = 0;
    //        while ((len = bis.read())!=-1){
    //            bos.write(len);
    //        }
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
        long s1 = System.currentTimeMillis();
        System.out.println(s1-s);

    }
}
