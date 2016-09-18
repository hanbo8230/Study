package day9_0918.test;

import java.io.File;
import java.io.IOException;

/**
 * Created by 韩博 on 2016/9/18.
 */
public class Test_1 {
    public static void main(String[] args) {
        //File 类的对象,将D:\\1.txt路径下的文件封装成file类的对象
        File f1 = new File("D:\\1");
        //判断D:\\ 目录下1.txt是否存在
        if (f1.exists()) {
//            f1.delete();
            sop("文件的长度为: " + f1.length());
        } else {
//          //创建文件夹 mkdir()
//                f1.mkdir();
            try {
            //创建文件 createNewFile()
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void sop(Object obj) {
        System.out.println(obj);
    }
}