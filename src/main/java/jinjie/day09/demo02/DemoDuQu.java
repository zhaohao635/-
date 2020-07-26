package jinjie.day09.demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

public class DemoDuQu {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("in//ab.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
