package day9_0910.test.work;

import java.util.Arrays;

/**
 * Created by 韩博 on 2016/9/11.
 * 将数组int[] f = {8,8,8,6};中的所有元素复制到一个新的数组中，并遍历新数组。
 */
public class Arr2 {
    public static void main(String[] args) {
        int[] f = {8, 8, 8, 6};
        int[] m = Arrays.copyOfRange(f, 0, f.length);
        System.out.println(Arrays.toString(m));

    }
}
