package day9_0918.test;

import java.io.File;
import java.io.IOException;

/**
 * Created by ���� on 2016/9/18.
 */
public class Test_1 {
    public static void main(String[] args) {
        //File ��Ķ���,��D:\\1.txt·���µ��ļ���װ��file��Ķ���
        File f1 = new File("D:\\1");
        //�ж�D:\\ Ŀ¼��1.txt�Ƿ����
        if (f1.exists()) {
//            f1.delete();
            sop("�ļ��ĳ���Ϊ: " + f1.length());
        } else {
//          //�����ļ��� mkdir()
//                f1.mkdir();
            try {
            //�����ļ� createNewFile()
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