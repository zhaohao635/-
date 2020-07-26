package jinjie.day03;
/*
* String当中与转换相关的常用的方法有
* public char[ ] toCharArray():将当前字符串拆分称为字符串数组作为返回值
* public byte[ ] getBytes():获得当前字符串底层的字节数组
* public String replace(CharSequence oldString,CharSequence newString):替换
* */
public class Demo08StringConvert {
    public static void main(String[] args) {
        char[] chars = "helloworld".toCharArray();
        System.out.println(chars[0]);
        byte[] bytes = "helloworld".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        String str3 = "how are you".replace("o", "*");
        System.out.println(str3);
    }

}
