package day9_0910.test.work;


import java.util.Arrays;

/**
 * Created by ���� on 2016/9/11.
 * ������int[] g = {9,4,10,3,1};�еĵ�3��Ԫ��10��ΪԪ��8�����ұ��������顣
 */
public class Arr3 {
    public static void main(String[] args) {
        int[] g = {9, 4, 10, 3, 1};
        g[2] = 8;
        System.out.print(Arrays.toString(g));
    }
}
