package day9_0918.test;

import java.io.*;

/**
 * Created by 韩博 on 2016/9/18.
 */
public class Test_2 {
    public static void main(String[] args) {
        Test_2.xie();
    }

    public static void du() {
        File f = new File("D:\\1.txt");
        InputStream in = null;
        try {
            in = new FileInputStream(f);
            while (true) {
                int a = in.read();
                if (a == -1) {
                    break;
                } else {
                    so((char) a);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void xie() {
        File f = new File("D:\\海子.txt");
        File f1 = new File("D:\\2.txt");
        FileReader in = null;
        FileWriter os = null;
        try {
            in = new FileReader(f);
            //追加内容, FileWriter(File file ,boolean append)
            os = new FileWriter(f1,true);
            while (true) {
                int a = in.read();
                if (a == -1) {
                    break;
                } else {
                    so((char) a);
                    os.write(a);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static void sop(Object obj) {
        System.out.println(obj);
    }

    public static void so(Object obj) {
        System.out.print(obj);
    }
}
