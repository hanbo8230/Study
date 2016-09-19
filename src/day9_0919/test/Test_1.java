package day9_0919.test;

import day9_0910.test.work.Sys;

import java.io.*;

/**
 * Created by 韩博 on 2016/9/19.
 */
public class Test_1 {
    public static void main(String[] args) {
        Test_1.go();
    }

    public static void go() {
        File f1 = new File("D:海子.txt");
        File f2 = new File("D:海子new.txt");
        //字节流
        InputStream is = null;
        OutputStream os = null;
        //转换流 转字符 Reader
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        //字符缓冲缓冲流
        BufferedReader r = null;
        BufferedWriter w = null;
        try {
            is = new FileInputStream(f1);
            os = new FileOutputStream(f2);
            isr = new InputStreamReader(is, "GBK");
            osw = new OutputStreamWriter(os, "GBK");
            r = new BufferedReader(isr);
            w = new BufferedWriter(osw);
//            while (true) {
//                String a = r.readLine();
//                if (a == null) {
//                    break;
//                } else {
//                    sop(a + "\n");
//                }
//            }
            while (true) {
                int a = r.read();
                if (a == -1) {
                    break;
                } else {
                    w.write(a);
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                w.flush();
                w.close();
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
