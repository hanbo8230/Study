package day9_0919.test;

import java.io.File;

/**
 * Created by º«²© on 2016/9/19.
 */
public class Test_2 {
    public static void main(String[] args) {
        File file = new File("D:\\xxx\\yyy");
        file.mkdir();
        sop(file);
    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
