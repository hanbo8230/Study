package day9_0910.test.work;

import java.util.Arrays;

/**
 * Created by ���� on 2016/9/11.
 * ������int[] f = {8,8,8,6};�е�����Ԫ�ظ��Ƶ�һ���µ������У������������顣
 */
public class Arr2 {
    public static void main(String[] args) {
        int[] f = {8, 8, 8, 6};
        int[] m = Arrays.copyOfRange(f, 0, f.length);
        System.out.println(Arrays.toString(m));

    }
}
