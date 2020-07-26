package jinjie.day08.demo04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputCopyOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\a.rar");
        FileInputStream fis = new FileInputStream("F:\\jieguo\\jieguo.rar");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

    }
}
