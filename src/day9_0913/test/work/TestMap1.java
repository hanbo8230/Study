package day9_0913.test.work;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/13.
 * 1）使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示上述
 * 课程安排。
 * 2） 增加了一位新老师Allen 教JDBC
 * 3） Lucy 改为教CoreJava
 * 4） 遍历Map，输出所有的老师及老师教授的课程(
 * 两种方法使用比较：
 */
public class TestMap1 {
    public static void main(String[] args) {
        TestMap1 t = new TestMap1();
        t.go();
    }

    public void go() {
        Map<String, String> mp = new HashMap<String, String>();
        mp.put("tom", "CoreJava");
        mp.put("John", "Oracle");
        mp.put("Susan", "Oracle");
        mp.put("Jerry", "JDBC");
        mp.put("Jim", "Unix");
        mp.put("Kevin", "JSP");
        mp.put("Lucy", "JSP");
        // mp.values();
        //sop(mp.entrySet());
        mp.put("Allen", "JDBC");
//    遍历Map，输出所有的老师及老师教授的课程
//      创建接受String类型的建的集合
//        Set<String> keys=mp.keySet();
//        for(String x: keys){
//            sop(x+" "+mp.get(x));
//        }
////   遍历Map，输出所有的老师及老师教授的课程
////       sop( mp.entrySet());
//        Set<String> keys1 = mp.keySet();
//        for (String x:keys1){
//            sop("老师名字: "+x+"\t教授的课程: "+mp.get(x));
//        }
        //利用迭代器
        Set keys2 = mp.entrySet();
        Iterator it=keys2.iterator();
        while (it.hasNext()){
            sop(it.next());
        }


    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
