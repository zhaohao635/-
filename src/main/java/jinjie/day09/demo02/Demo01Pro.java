package jinjie.day09.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Pro {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴","20");
        prop.setProperty("古力娜扎","21");
        FileWriter fw = new FileWriter("in\\ab.txt");
        prop.store(fw,"save data");
        prop.store(new FileOutputStream("in\\ac.txt"),"save data");
    }
}
