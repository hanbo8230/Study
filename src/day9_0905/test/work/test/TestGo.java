package day9_0905.test.work.test;

import java.util.Scanner;

import day9_0905.test.work.run.Go;

/**
 * Created by 韩博 on 2016/9/5.
 * 1    定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。在建立类的实例时，
 * 把以上三个信息都作为构造函数的参数输入，其中用户ID和用户密码时必须的，
 * email地址是用户ID加上字符串"@gameschool.com"
 * 2创建用户类数组，存放三个用户ID，密码，email地址。通过键盘输入用户ID和密码判断能登录成功网络。
 */
public class TestGo {
    Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        TestGo t = new TestGo();
        t.test();
    }


    public void test() {
        Go p1 = new Go("张三", 000000);
        Go p2 = new Go("李四", 888888);
        Go p3 = new Go("王二麻子", 666666);
        Go arr[] = {p1, p2, p3};

        System.out.println("请输入账户名: ");
        String id = in.next();
        System.out.println("请输入密码: ");
        int miMa = in.nextInt();
//        Go go = new Go(id, miMa);
        for (int x = 0; x <arr.length; x++) {
            if (arr[x].id.equals(id) && arr[x].miMa == miMa) {
                System.out.println("成功登录网络");
                break;
            } else if (x == arr.length-1) {
                System.out.println("输入账号的密码有误,请重新输入");
                test();
            }
        }
    }
}
