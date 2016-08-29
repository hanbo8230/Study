package day1_4;

import java.util.*;

public class Atm01 {
    public static void main(String[] args) {
        //1.自定义一个用户
        String username = "admin";
        String password = "888888";
        double balance = 1000.0;   //账户余额
        //2.登陆功能
        System.out.println("欢迎来到***银行");
        Scanner input = new Scanner(System.in);

        //进行三次循环,控制输入次数
        for (int x = 1; x <= 3; x++) {
            System.out.print("请输入用户名：");
            String name = input.next();
            System.out.print("请输入密码：");
            String pwd = input.next();
            if (username.equals(name) && password.equals(pwd)) {
                System.out.println(name + "登陆成功");
                System.out.print("请输入取款金额");
                    double qu = input.nextDouble();

         //进行取款，显示账户余额
                if(qu < balance) {
                    balance = balance - qu;
                    System.out.print("您已取走" + qu + "元\n余额为: " + balance + "元");
                    break;
                } else {

         //输入金额过大,报错并退出
                    System.out.print("你疯了吧,你哪有这么多钱,我给你退出系统了啊");
                    break;
                }
            } else {

         //重新提醒用户输入用户名和密码，输错三次，自动退出系统
                if (x != 3)
                    System.out.println("用户名或密码错误，登陆失败，请重新输入...");
                else if (x == 3) {
                    System.out.println("您的密码已输错三次,系统将自动退出");
                    break;
                }
            }

        }
    }
}
