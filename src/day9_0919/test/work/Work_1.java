package day9_0919.test.work;

import java.io.*;

/**
 * Created by 韩博 on 2016/9/19.
 * 一份文件里有学生成绩数据
 * 要求：
 * 把这个成绩单一行一行的读进来
 * 200841929212,熊哲,良好,27.0,0.0,88.0
 * 200841929212,小黑,良好,77.0,100,87.0
 * 把每一行进行分割，得到一个数组对象
 * String[] result = test.split(",");
 */
public class Work_1 {
    public static void main(String[] args) {
        Work_1.go();
    }

    public static void go() {
        File f1 = new File("D:\\work1.txt");
        Reader r = null;
        BufferedReader br = null;
        try {
            r = new FileReader(f1);
            br = new BufferedReader(r);

            while (true) {
                String a = br.readLine();
                if (a == null) {
                    break;
                } else {
                    String[] result = a.split(",");
                    for (int x = 0; x < result.length; x++) {
                        sop(result[x]+" ");
                    }
                }
                //换行
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public static void sop(Object obj) {
        System.out.print(obj);
    }
}
