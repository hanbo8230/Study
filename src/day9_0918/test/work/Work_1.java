package day9_0918.test.work;

import java.io.*;

/**
 * Created by ���� on 2016/9/18.
 * 1. ���������ж���һ���ļ������жϸ��ļ��Ƿ���ڡ�
 * ������ļ����ڣ�����ԭ�ļ���ͬ·���´���һ���ļ���Ϊ��copy_ԭ�ļ����������ļ���
 * ���ļ�����Ϊԭ�ļ��Ŀ�����
 */
public class Work_1 {
    public static void main(String[] args) {
        Work_1.du();
    }

    //���ļ�
    public static void du() {
        //����һ�����Ķ���,ָ���ļ��ľ���·��
        File f = new File("D:\\work1.txt");
        File f1 = new File("D:\\copy_work1.txt");
        FileWriter os = null;
        FileReader in = null;
        if (f.exists()) {
            sop("����");
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
            sop("������");
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
