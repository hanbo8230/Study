package day9_0919.test.work;

import java.io.*;

/**
 * Created by ���� on 2016/9/19.
 * һ���ļ�����ѧ���ɼ�����
 * Ҫ��
 * ������ɼ���һ��һ�еĶ�����
 * 200841929212,����,����,27.0,0.0,88.0
 * 200841929212,С��,����,77.0,100,87.0
 * ��ÿһ�н��зָ�õ�һ���������
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
                //����
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
