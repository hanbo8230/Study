package day9_0910.test.work;

/**
 * Created by 韩博 on 2016/9/10.
 * 1、将字符串“adcaaasxaaf”中所有的‘a’全部换成‘b’
 */
public class Huan {
    public static void main(String[] args) {
        String x="adcaaasxaaf1";
        String y=x.replace('a','b');
        sop(x);
        sop(y);

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
