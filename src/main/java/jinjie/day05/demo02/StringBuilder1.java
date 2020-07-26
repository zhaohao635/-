package jinjie.day05.demo02;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        bu1.append(51);
        bu1.append("wer").append(123);
        System.out.println(bu1);
        String s = Integer.toString(1);
        String s1 = Double.toString(2);
        int i = Integer.parseInt("10");
        System.out.println(i);
        double v = Double.parseDouble("12.2");
        System.out.println(v);
    }
}
