package day9_0913.test.work;

import java.util.*;

/**
 * Created by ���� on 2016/9/13.
 * Ҫ��:�ж�����ʱ,ÿ�����ʳ��ֵĸ���
 */
public class TestMap {
    Scanner in = new Scanner(System.in);


    public void go() {
        int q = 0;
        Map<Integer, String> mp = new HashMap<Integer, String>();
        System.out.println("������������");
        int x = in.nextInt();
        String[] arr = new String[x];
        for (int y = 0; y < x; y++) {
            System.out.println("�������" + (y + 1) + "����");
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
