package day9_0910.test.work;

import java.util.Arrays;

/**
 * Created by ���� on 2016/9/10.
 * ����Arrays���з�����ʹ��
 * ������int[] a ={1,4,6,3,7,8}�е�Ԫ�ذ���С�����˳�����С�
 * �����ź����������Ϊ�ַ�����ʽ������磺[1,3,4,6,7,8]
 */
public class Arr {
    public static void main(String [] args){
        int[] a ={1,4,6,3,7,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

