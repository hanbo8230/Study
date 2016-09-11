package day9_0910.test.work;

/**
 * Created by 韩博 on 2016/9/10.
 * 如何将“aaa_bbb_ccc”字符串截取成aaa，bbb，ccc字符
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
