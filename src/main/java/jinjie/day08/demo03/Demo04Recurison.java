package jinjie.day08.demo03;

import java.io.File;

public class Demo04Recurison {
    public static void main(String[] args) {
        File dir = new File("F:\\java文档\\java文档");
        getAllFile(dir);
    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            } else {
//                String s = file.toString();
//                boolean b = s.endsWith(".pdf");
                if (file.getName().toLowerCase().endsWith(".pdf")){
                    System.out.println(file);
                }

            }
        }
    }
}
