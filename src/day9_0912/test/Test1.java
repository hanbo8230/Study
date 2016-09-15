package day9_0912.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by 韩博 on 2016/9/12.
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        //集合中添加元素
        a1.add("java 1");
        a1.add("java 2");
        a1.add("java 3");
        sop(a1);
        //集合中删除所有元素
        //a1.clear();
        //sop(a1);
        //集合中删除某个元素
        //a1.remove("java 1");
        //sop(a1);
        //获取迭代器
        Iterator it =a1.iterator();
        //利用迭代器打印元素
        while (it.hasNext()){
            sop(it.next());
        }
        //利用for循环打印元素
        for (Object x: a1){
            sop("for"+x);
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }

}
