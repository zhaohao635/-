package jinjie.day09.demo02;

import java.util.Properties;
import java.util.Set;

public class Pro {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("迪丽热巴","20");
        prop.setProperty("古力娜扎","21");
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+value);
        }
    }
}
