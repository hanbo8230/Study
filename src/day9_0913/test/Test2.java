package day9_0913.test;

import java.util.*;

/**
 * Created by ���� on 2016/9/13.
 */
public class Test2 {
    public static void main(String[] args) {
        Set<String> se = new HashSet<String>();
        se.add("��һ");
        se.add("�ڶ�");
        se.add("����");
        sop(se);
        Set<String> se1 = new TreeSet<String>();
        se1.add("��һ");
        se1.add("�ڶ�");
        se1.add("����");
        Iterator<String> it = se1.iterator();
        while (it.hasNext()) {
            sop(se1);
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
