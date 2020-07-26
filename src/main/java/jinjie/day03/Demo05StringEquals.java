package jinjie.day03;

public class Demo05StringEquals {
    /*
    * ==是进行对象的地址值比较，如果确实需要进行字符串比较，有两种方法
    * public boolean equals(Object obj)
    * equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
    * 如果比较双方一个常量一个变量，推荐把常量字符串写在前面
    * public boolean equalsIgnoreCase(String str)忽略大小写
    * */
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("Hello".equals(str3));
    }
}
