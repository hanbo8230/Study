package day9_0910.test.work;

/**
 * Created by ���� on 2016/9/10.
 * ��ν���aaa_bbb_ccc���ַ�����ȡ��aaa��bbb��ccc�ַ�
 */
public class AaBbCc {
    public static void main(String[] args){
        String x="aaa_bbb_ccc";
        sop(x);
        sop(x.replace('_',','));

    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }

}
