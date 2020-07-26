package jinjie.day05.demo02;

import java.util.Calendar;

public class rili {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        c.set(Calendar.MONDAY,11);
        System.out.println(c.get(Calendar.MONDAY));
        c.add(Calendar.YEAR,2);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.getTime().toLocaleString());

    }
}
