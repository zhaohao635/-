package jinjie.day09.demo05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class TCPClient {
    public static void main(String[] args) throws IOException {
//        Socket socket = new Socket("127.0.0.1",8888);
//        OutputStream os = socket.getOutputStream();

        Random r = new Random();
        for (int i = 0; i < 10; i++) {            //10.fori快捷键
            int num = r.nextInt(2);            //alt+回车
            System.out.println(num);

        }
        char c = 'a';
        System.out.println("=======");
        System.out.println(c);
        System.out.println(c+5);
        int b = c;
        System.out.println(b+5);
    }
}
