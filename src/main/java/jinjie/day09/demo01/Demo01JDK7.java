package jinjie.day09.demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01JDK7 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("F:\\jieguo\\jieguo.rar");
            FileOutputStream fos = new FileOutputStream("F:\\a.rar");){
            int len = 0;
            byte[] ca = new byte[1024];
            while ((len=fis.read(ca))!=-1){
                fos.write(ca,0,len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
