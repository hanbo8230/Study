package day9_0910.test.work;

import java.util.Arrays;

/**
 * Created by 韩博 on 2016/9/10.
 * 查阅Arrays类中方法的使用
 * 将数组int[] a ={1,4,6,3,7,8}中的元素按从小到大的顺序排列。
 * 并将排好序的数组作为字符串形式输出。如：[1,3,4,6,7,8]
 */
public class Arr {
    public static void main(String [] args){
        int[] a ={1,4,6,3,7,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

