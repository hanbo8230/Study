package day9_0914.test;

import day9_0910.test.work.Sys;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/14.
 */
public class Test2 {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.go();

    }

    public void go() {
        try {
            sop("请输入两个小数参数\n输入第一个: ");

            double a = in.nextDouble();
            sop("输入第二个: ");
            double b = in.nextDouble();
            sop("运算结果为: " + (a / b));
        } catch (InputMismatchException e1) {
            sop("输入的数据错误");
            go();
        } catch (ArithmeticException e2) {
            sop("输入的 b 的值不能为 0");

        } catch (Exception e) {
            sop("有错误");
        }

    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
