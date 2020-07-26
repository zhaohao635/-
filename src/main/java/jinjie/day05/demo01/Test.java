package jinjie.day05.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        //请输入出生年月日
        System.out.println("请输入出生年月日");
        Scanner scanner = new Scanner(System.in);
        String birthDay = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(birthDay);
        long time = parse.getTime();
        Date todaytime = new Date();
        long mil = todaytime.getTime();
        long l = mil - time;
        System.out.println(l/1000/24/60/60);
    }
}
