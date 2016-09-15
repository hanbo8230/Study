package day9_0910.test.work;

import java.util.Calendar;

/**
 * Created by 韩博 on 2016/9/11.
 * 1、打印出当前系统的日期和时间。
 */
public class Sys2 {
    public static void main(String[] args) {
        Calendar a= Calendar.getInstance();
        System.out.println(a.getTime());
    }
}
