package jinjie.day05.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(0L);
        System.out.println(date);
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(System.currentTimeMillis());
        System.out.println(date1.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String text = sdf.format(date1);        //2020年07月15日 20时05分30秒
        System.out.println(text);
        Date date2 = sdf.parse("2020年07月15日 20时05分30秒");
        System.out.println(date2);

    }
}
