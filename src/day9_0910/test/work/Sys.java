package day9_0910.test.work;


import java.util.Arrays;

/**
 * Created by ���� on 2016/9/11.
 * ���ڸ����������飺
 * ����a��1��7��9��11��13��15��17��19
 * ����b��2��4��6��8��10
 * ��������ϲ�Ϊ����c�����������С�
 */
public class Sys {
    public static void main(String[] args) {
        int[] a = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] b = {2, 4, 6, 8, 10};
        int []c= new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
