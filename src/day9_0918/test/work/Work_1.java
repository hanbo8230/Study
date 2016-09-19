package day9_0918.test.work;

import java.io.*;

/**
 * Created by 韩博 on 2016/9/18.
 * 1. 从命令行中读入一个文件名，判断该文件是否存在。
 * 如果该文件存在，则在原文件相同路径下创建一个文件名为“copy_原文件名”的新文件，
 * 该文件内容为原文件的拷贝。
 */
public class Work_1 {
    public static void main(String[] args) {
        Work_1.du();
    }

    //读文件
    public static void du() {
        //创建一个流的对象,指向文件的绝对路径
        File f = new File("D:\\work1.txt");
        File f1 = new File("D:\\copy_work1.txt");
        FileWriter os = null;
        FileReader in = null;
        if (f.exists()) {
            sop("存在");
            try {
                f1.createNewFile();
                in = new FileReader(f);
                os = new FileWriter(f1);
                while (true) {
                    int a = in.read();
                    if (a == -1) {
                        break;
                    } else {
                        os.write(a);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    os.close();
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } else {
            sop("不存在");
//            try {
//
//                f.createNewFile();
//
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//
//            }
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
