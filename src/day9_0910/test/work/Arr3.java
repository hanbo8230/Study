package day9_0910.test.work;


import java.util.Arrays;

/**
 * Created by 韩博 on 2016/9/11.
 * 将数组int[] g = {9,4,10,3,1};中的第3个元素10变为元素8，并且遍历新数组。
 */
public class Arr3 {
    public static void main(String[] args) {
        int[] g = {9, 4, 10, 3, 1};
        g[2] = 8;
        System.out.print(Arrays.toString(g));
    }
}
