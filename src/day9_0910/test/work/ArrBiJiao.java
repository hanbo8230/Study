package day9_0910.test.work;

import java.util.Arrays;

/**
 * Created by 韩博 on 2016/9/10.
 * 比较数组int[] b={1,2,3,4,5};和数组int[] c={1,2,3,4,5};是否相等
 */
public class ArrBiJiao {
    public static void main(String[] args) {
        int[] b={1,2,3,4,5};
        int[] c={1,2,3,4,5};
        System.out.println(Arrays.equals(b,c));
    }
}
