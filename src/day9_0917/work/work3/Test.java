package day9_0917.work.work3;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/17.
 * 设计自己的异常类表示对负数求平方根的错误；在类Test的主方法中，
 * 从键盘输入一个数，若输入的数不小于0，则输出它的平方根；若小于0，
 * 则抛出自定义异常；在程序中处理异常并输出提示信息“输入错误，不能对负数求平方根”
 */

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println(fun());
        } catch (MyException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static double fun() throws MyException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个非负数：");
        int s = input.nextInt();
        if (s >= 0) {
            return Math.sqrt(s);
        } else {
            throw new MyException("不是正数");
        }
    }
}
