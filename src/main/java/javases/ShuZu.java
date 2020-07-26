package javases;

import javax.print.DocFlavor;
import java.sql.SQLOutput;

public class ShuZu {
    public static void main(String[] args) {
        int[] arr = new int[10];
        String[] arrb = new String[]{"python","java"};

        int[] arrc = new int[]{1, 2, 3};
        int[] arrcd = {12,45,6};
        System.out.println(arrcd[0]);
        System.out.println(arr[0]);
        arr[0] = 45;
        System.out.println(arr[0]);
        System.out.println(arrb);
        int[] arrbd = arrc;
        System.out.println(arrbd[0]);
        arrbd[0]=78;
        System.out.println(arrc[0]);
        System.out.println(arrbd[0]);
        int lens = arrb.length;
        System.out.println(lens);
        
    }

}
