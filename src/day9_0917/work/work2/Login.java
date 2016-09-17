package day9_0917.work.work2;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/17.
 * 编写一个登录界面，要求帐户名只能由1至10位数字组成，
 * 密码只能有6位，任何不符合帐户名和密码要求的情况都视为异常，
 * 必须捕获并处理异常
 */

public class Login {

    public static void main(String[] args) {
        while (true) {
            try {
                fun();
                break;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        System.out.println("login....");
    }

    public static int inputInt() {
        Scanner input = new Scanner(System.in);
        try {
            int s = input.nextInt();
            return s;
        } catch (InputMismatchException e) {
            System.out.println("不是数字");
            System.exit(0);
            return 0;
        }
    }

    static void fun() throws IllegalArgumentException {
        System.out.print("请输用户名：");
        int name = inputInt();
        if (name < 1 || name > 999999999) {
            throw new IllegalArgumentException("用户名不满足范围限定");
        }
        System.out.print("请输入密码：");
        int password = inputInt();
        if (password < 100000 || password > 999999) {
            throw new IllegalArgumentException("密码不满足范围限定");
        }

    }
}
