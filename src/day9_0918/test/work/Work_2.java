package day9_0918.test.work;

import java.io.*;


/**
 * Created by 韩博 on 2016/9/18.
 * 从D盘一个图片比如（cat.jpg）读取数据，写入到另外一个catnew.jpg文件里
 */
public class Work_2 {
    public static void main(String[] args) {
        Work_2.go();
    }

    public static void go() {
        File f = new File("D:\\dog.jpg");
        File f1 = new File("D:\\dognew.jpg");
        Reader in = null;
        Writer os = null;
        if (f.exists()) {
            sop("存在");
            try {
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
        } else {
            sop("不存在");
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
