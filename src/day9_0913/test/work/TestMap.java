package day9_0913.test.work;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/13.
 * 要求:判断运行时,每个单词出现的个数
 */
public class TestMap {
    Scanner in = new Scanner(System.in);


    public void go() {
        int q = 0;
        Map<Integer, String> mp = new HashMap<Integer, String>();
        System.out.println("请输入存入个数");
        int x = in.nextInt();
        String[] arr = new String[x];
        for (int y = 0; y < x; y++) {
            System.out.println("请输入第" + (y + 1) + "名字");
            String i = in.next();
            arr[y] = i;
        }
        for(String i :arr){
//            if(mp.get(i) != null){
//
//            }
            sop(i);
        }


//        for (int y = 0; y < x; y++) {
//            if (mp.get(y)==(mp.get(0))){
//                q+=1;
//            }
//        }
//        sop(q);
    }

    public static void main(String[] args) {
        TestMap a = new TestMap();
        a.go();
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }

}
