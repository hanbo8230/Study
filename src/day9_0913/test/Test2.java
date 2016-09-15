package day9_0913.test;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/13.
 */
public class Test2 {
    public static void main(String[] args) {
        Set<String> se = new HashSet<String>();
        se.add("第一");
        se.add("第二");
        se.add("第三");
        sop(se);
        Set<String> se1 = new TreeSet<String>();
        se1.add("第一");
        se1.add("第二");
        se1.add("第三");
        Iterator<String> it = se1.iterator();
        while (it.hasNext()) {
            sop(se1);
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
