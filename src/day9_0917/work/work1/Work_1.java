package day9_0917.work.work1;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/17.
 * 编写程序，要求输入若干整数，输入的同时计算前面输入各数的乘积，
 * 若乘积超过100000，则认为是异常，捕获并处理这个异常，输出信息。
 */
public class Work_1 {

    public static void main(String[] args) {
        try {
            max();
        } catch (InputMismatchException e) {
            System.out.println("输入不是整数");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void max() throws IllegalArgumentException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要输入数字的个数：");
        int t = 0;
        while (true) {
            try {
                t = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("输入错误，请输入一个正整数：");
                input=new Scanner(System.in);
            }
        }
        int x = 1;
        for (int j = 0; j < t; j++) {
            System.out.print("请输入一个数：");
            int i = input.nextInt();
            x = x * i;
            if (x <= 100000) {
                continue;
            } else {
                throw new IllegalArgumentException("乘积不能大于100000");
            }
        }
        System.out.println(x);
    }
}