package day2_0829.test.work;

/**
 * Created by ���� on 2016/8/29.
 * Ҫ��:��дһ�����ܣ�ʵ��������int���е����ֵ���������ֵ���أ�����main�����н��е��á�
 */
public class Get {
    public static void main(String[] args) {
        System.out.print(get_max(39,32));
    }

    //��ȡ���ֵ
    public static int get_max(int a, int b) {
        int num = 0;
        if (a < b) {
            num =b;
        }else{
            num =a;
        }
        return num;
    }
}
