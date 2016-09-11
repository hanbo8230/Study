package day9_0910.test.work;

import java.util.Arrays;

/**
 * Created by 韩博 on 2016/9/11.
 * 将数组int[] k = {0,3,4,5,6};中的所有位置上的元素都变为1，并且遍历新数组。
 */
public class Arr4 {
    public static void main(String[] args) {
        int[] k = {0, 3, 4, 5, 6};
        Arrays.fill(k,1);
        System.out.print(Arrays.toString(k));
    }
}
